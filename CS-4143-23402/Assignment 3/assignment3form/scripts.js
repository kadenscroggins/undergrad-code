var approval = "N/A";
var feedback = "N/A";

window.onload = update();

function setApproval(x) {
  approval = x;
  update();
}

function setFeedback(x) {
  feedback = x;
  update();
}

function update() {
  text = document.getElementById("feedback-info");
  text.value =
    "Type of feedback: " + feedback + "\n" +
    "Approval Rating: " + approval + "\n" + 
    "Your E-mail: " + document.getElementById("email").value + "\n\n" +
    "Applicable Site sections: \n";
  if (form1.checkbox[0].checked) text.value += "Home ";
  if (form1.checkbox[1].checked) text.value += "Listings ";
  if (form1.checkbox[2].checked) text.value += "Contact ";
  if (form1.checkbox[3].checked) text.value += "Reviews ";
  if (form1.checkbox[4].checked) text.value += "Feedback ";
  if (form1.checkbox[5].checked) text.value += "Other ";
}

function submitFeedback() {
  alert("Feedback submitted!");
  window.location.reload(false);
}