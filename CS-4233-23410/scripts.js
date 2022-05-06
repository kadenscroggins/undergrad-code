var rpgJSON = {
  characters: ["Sample character 1", "Sample character 2"],
  // 3D array:
  // First array holds arrays that represent characters
  // Second array holds two arrays, one for item names and one for item weights
  // Third array holds values, like key-value pairs - ex, "Sword" and 5 are a pair
  // Third array in third array is quantity of items
  inventories: [
    [
      ["Sword", "Shield", "Boots"],
      [5, 2, 1],
      [1, 1, 1]
    ],
    [
      ["Wand", "Fruit", "Hat"],
      [1, 3, 1],
      [1, 1, 1]
    ]
  ]
};

window.onload = function loadPage() {
  /* 
    Only auto-load client once project is complete
    and data structure is unchanging
  */
  loadClient();
  genCharacters();
}

// Add character to list
function addCharacter() {
  var newchar = document.getElementById("newchar");
  if (newchar.value === "") {
    alert("Please enter a character name");
    return;
  }
  rpgJSON.characters.push(newchar.value);
  rpgJSON.inventories.push([[],[],[]]);
  genCharacters();
}

// Delete character at index from list
function removeCharacter(index) {
  if (window.confirm("Really delete " + rpgJSON.characters[index] + "?")) {
    if (index==0) {
      rpgJSON.characters.shift();
      rpgJSON.inventories.shift();
    }
    else {
      rpgJSON.characters.splice(index, 1);
      rpgJSON.inventories.splice(index, 1);
    }  
    document.getElementById("inventory").style.display = "none";
    genCharacters();
  }
}

// Generate list of characters and display
function genCharacters() {
  checkData();
  saveClient();

  var div = document.getElementById("chardiv");

  // Head of table containing column headings
  var newHTML = "<table><tr><th>Name</th><th>Weight</th><th /></tr>";

  // Body of table containing list of characters
  for (let i=0; i<rpgJSON.characters.length; i++) {
    newHTML += "<tr><th class=\"clickable\" onclick=\"openInventory(" + i + ")\">"
      + rpgJSON.characters[i] + "</th><th>" + weighItems(i) + " lbs"
      + "<th><button type=\"button\" class=\"deletebutton\" onclick=\"removeCharacter("+ i +")\">"
      + "X</button></th></tr>";
  }

  // Tail of table containing new character box
  newHTML += "<h2>Characters"
    + "<tr><th><input type=\"text\" id=\"newchar\" placeholder=\"New Character\"></th>"
    + "<th><button type=\"button\" class=\"backbutton\" onclick=\"document.getElementById('inventory').style.display = 'none'\">←</th>"
    + "<th><button type=\"button\" class=\"createbutton\" onclick=\"addCharacter()\">+</button></th></tr>";
  newHTML += "</table>";
  div.innerHTML = newHTML;
}

// Add item to inventory at index
function addItem(index) {
  if (Number.isNaN(Number.parseFloat(document.getElementById("newitemweight").value))) {
    alert("Please input a number for item weight");
    return;
  }
  if (document.getElementById("newitemname").value.length == 0) {
    alert("Please input an item name");
    return;
  }
  if (document.getElementById("newitemquantity").value.length == 0) {
    alert("Please input an item quantity");
    return;
  }
  var newitem = document.getElementById("newitemname");
  var newweight = document.getElementById("newitemweight");
  var newquantity = document.getElementById("newitemquantity");
  (rpgJSON.inventories[index][0]).push(newitem.value);
  (rpgJSON.inventories[index][1]).push(Number.parseFloat(newweight.value));
  (rpgJSON.inventories[index][2]).push(Number.parseFloat(newquantity.value));
  openInventory(index);
  genCharacters();
}

// Remove item at index from character at index
function removeItem(charindex, itemindex) {
  if (window.confirm("Really delete " + rpgJSON.inventories[charindex][0][itemindex] + "?")) {
    if (itemindex==0) {
      rpgJSON.inventories[charindex][0].shift();
      rpgJSON.inventories[charindex][1].shift();
    }
    else {
      rpgJSON.inventories[charindex][0].splice(itemindex, 1);
      rpgJSON.inventories[charindex][1].splice(itemindex, 1);
    }
    openInventory(charindex);
    genCharacters();
  }
}

// Update the quantity of an item carried
function updateQuantity(charindex, itemindex, newvalue) {
  if (Number.isNaN(Number.parseFloat(newvalue))) {
    rpgJSON.inventories[charindex][2][itemindex] = 0;
  }
  else rpgJSON.inventories[charindex][2][itemindex] = Number.parseFloat(newvalue);
  genCharacters();
  openInventory(charindex);
}

// Return weight of character at index
function weighItems(index) {
  let sum = 0;
  for(let i=0; i<rpgJSON.inventories[index][1].length; i++) {
    sum += rpgJSON.inventories[index][1][i] * rpgJSON.inventories[index][2][i];
  }
  return sum;
}

// Returns a text input that also acts as a select input
function genEditableSelectItems(index) {
  var div = "<div style=\"position:relative;width:200px;height:25px;border:0;padding:0;margin:0;\">" +
    "<select style=\"position:absolute;top:0px;left:0px;width:200px; height:25px;line-height:20px;margin:0;padding:0;\"" +
      "onchange=\"document.getElementById('newitemweight').value=this.options[this.selectedIndex].dataset.weight; " +
                "document.getElementById('newitemquantity').value=1; " +
                "document.getElementById('newitemname').value=this.options[this.selectedIndex].text; " +
                "document.getElementById('idValue').value=this.options[this.selectedIndex].value; " +
                "addItem(" + index + ")\">" +
    "<option></option>";

    for (let i=0; i<itemJSON.items.length; i++) {
      div += "<option value=\"" + itemJSON.items[i] + "\" data-weight=\"" + itemJSON.weights[i] + "\">"
        + itemJSON.items[i] + "</option>";
    }

    //div += 
    //"<option value=\"one\">one</option>" +
    //"<option value=\"two\">two</option>" +
    //"<option value=\"three\">three</option>";

  div += "</select>" +
  "<input type=\"text\" name=\"newitemname\" id=\"newitemname\"" +
    "placeholder=\"add/select a value\" onfocus=\"this.select()\"" +
    "style=\"position:absolute;top:0px;left:0px;width:12em;width:12em\\9;#width:12em;height:21px; height:21px\\9;#height:21px;border:1px solid #556;\">" +
  "<input name=\"idValue\" id=\"idValue\" type=\"hidden\">" +
  "</div>";

  return div
}

// Generate and display spreadsheet for selected character
function openInventory(index) {
  checkData();
  saveClient();

  var div = document.getElementById("inventory");
  div.style.display = "block";

  // Head of table containing column headings
  var newHTML = "<table><tr><th>Item Name</th><th>Item Weight</th><th>#</th>" +
  "<th><button type=\"button\" class=\"backbutton\" onclick=\"document.getElementById('inventory').style.display = 'none'\">←</th></tr>";

  // Body of table containing list of characters
  for (let i=0; i<rpgJSON.inventories[index][0].length; i++) {
    newHTML += "<tr><th>" + rpgJSON.inventories[index][0][i] + "</th>"
      + "<th>" + rpgJSON.inventories[index][1][i] + " lbs</th>"
      + "<th><input type=\"number\" value=\"" + rpgJSON.inventories[index][2][i] + "\" onchange=\"updateQuantity(" + index + ", " + i + ", this.value)\"></th>"
      + "<th><button type=\"button\" class=\"deletebutton\" onclick=\"removeItem(" + index + ", " + i + ")\">X</th></tr>";
  }

  // Tail of table containing new character box
  newHTML += "<h2>Inventory of " + rpgJSON.characters[index] + " - Total Weight: " + weighItems(index) + " lbs" +
    //"<tr><th><input type=\"text\" id=\"newitemname\" placeholder=\"New Item\"></th>" +
    "<tr><th>" + genEditableSelectItems(index) + "</th>" +
    "<th><input type=\"number\" id=\"newitemweight\" placeholder=\"Weight\"></th>" +
    "<th><input type=\"number\" id=\"newitemquantity\" placeholder=\"Quantity\"></th>" +
    "<th><button type=\"button\" class=\"createbutton\" onclick=\"addItem(" + index + ")\">+</button></th></tr>";
  newHTML += "</table> ";
  div.innerHTML = newHTML;
}

// Load data from local storage
function loadClient() {
  var strJSON = localStorage.getItem("rpgJSON");
  if (strJSON) {
    rpgJSON = JSON.parse(strJSON);
    genCharacters();
  }
  else alert("No data saved on client");
}

// Save data to local storage
function saveClient() {
  var strJSON = JSON.stringify(rpgJSON);
  localStorage.setItem("rpgJSON", strJSON);
}

// Save file
function saveFile() {
  const a = document.createElement("a");
  const file = new Blob([JSON.stringify(rpgJSON)], 
    { type: "text/plain;charset=utf-8" });
  a.href = URL.createObjectURL(file);
  a.download = "InventoryExport_" + (new Date().getTime()) + ".json";
  a.click();

  URL.revokeObjectURL(a.href);
}

// Load file
async function loadFile(event) {
  const file = event.target.files.item(0);
  const text = await file.text();
  rpgJSON = JSON.parse(text);
  genCharacters();
}

// Post data to server using jQuery
function saveServer() {
  if (document.getElementById("savekey").value === "") {
    alert("Please enter a save key");
    return;
  }
  $.post("upload.php",
    {
      savekey: document.getElementById("savekey").value,
      jsonstring: JSON.stringify(rpgJSON)
    },
    function(response) {
      alert("Successfully saved file to server");
    }
  );
}

// Retrieve data from server using jQuery
function loadServer() {
  if (document.getElementById("savekey").value === "") {
    alert("Please enter a save key");
    return;
  }
  $.getJSON('https://crab.business/capstone/data/' + document.getElementById("savekey").value + ".json",
    function(data) {
      rpgJSON = data;
      genCharacters();
    })
  .fail(function() { alert("Invalid save key");});
}

// Fill in gaps in improperly formatted data that is loaded
function checkData() {
  while (rpgJSON.characters.length < rpgJSON.inventories.length) {
    rpgJSON.characters.push("");
  }
  while (rpgJSON.characters.length > rpgJSON.inventories.length) {
    rpgJSON.inventories.push([[],[],[]]);
  }
  for(let i=0; i<rpgJSON.inventories.length; i++) {
    while (rpgJSON.inventories[i][0].length < rpgJSON.inventories[i][1].length) {
      rpgJSON.inventories[i][0].push("Unnamed");
    }
    while (rpgJSON.inventories[i][0].length > rpgJSON.inventories[i][1].length) {
      rpgJSON.inventories[i][1].push(0);
    }
  }
}