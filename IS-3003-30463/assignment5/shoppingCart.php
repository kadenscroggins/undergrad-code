<?php
$price = 0;
$total = 0;
$imgFileName = "";
$quantity = 1;

function test_input($data) {
  $data = trim($data);
  $data = stripslashes($data);
  $data = htmlspecialchars($data);
  return $data;
}

if ($_SERVER["REQUEST_METHOD"] == "POST") {

  if (!empty($_POST["price"])) {
    $price = test_input($_POST["price"]);
  }

  if (!empty($_POST["imgFileName"])) {
    $imgFileName = test_input($_POST["imgFileName"]);
  }

  if (!empty($_POST["quantity"])) {
    $quantity = test_input($_POST["quantity"]);
  }

  $total = $price * $quantity;
}

?>


<!--
  IS-3003-30463
  Assignment 5 shopping cart
  Kaden Scroggins

  Changes from the lecture video:
  - Added $total because if you clicked "recalculate order"
  	it would keep multiplying the price incorrectly
  - Modified the total to format the price out to two
  	decimal places at all times
-->

<body style="padding:30px;">

<h2> Shopping Cart </h2>

<form method="post" name="shoppingCart" id="shoppingCart" action="
  <?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">

Total: <?php echo '$' . number_format((float)$total, 2, '.', '');?>

<p>

<?php if ($imgFileName != "")
  echo "<img src=\"$imgFileName\" style=\"max-height:125px; max-width:125px;\" > ";
?>

<p>

Quantity: <input type="text" name="quantity" value="<?php echo $quantity;?>" size="10">

<p>

<input type="hidden" name="imgFileName" value="<?php echo $imgFileName;?>">
<input type="hidden" name="price" value="<?php echo $price;?>">

<input type="submit" value="Recalculate Order">

</form>

</body>