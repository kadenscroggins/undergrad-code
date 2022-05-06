<?php
$tax = 0;
$total = 0;
$membership = "";
$tennis = "no";
$racquetball = "no";
$golf = "no";
$childcare = "no";
$personaltrainer = "no";
$swimmingpool = "no";

function test_input($data) {
  $data = trim($data);
  $data = stripslashes($data);
  $data = htmlspecialchars($data);
  return $data;
}

if ($_SERVER["REQUEST_METHOD"] == "POST") {
  if (!empty($_POST["tax"])) {
    $tax = test_input($_POST["tax"]);
  }

  if (!empty($_POST["membership"])) {
    $membership = test_input($_POST["membership"]);
  }

  if ($membership == "basic") {
    $total = 80;
  }
  elseif ($membership == "gold") {
    $total = 100;
  }
  elseif ($membership == "goldplus") {
    $total = 120;
  }
  else {
    $total = 0;
  }

  if (isset($_POST["tennis"])) {
    $tennis="yes";
    $total += 15;
  }

  if (isset($_POST["racquetball"])) {
    $racquetball="yes";
    $total += 20;
  }

  if (isset($_POST["golf"])) {
    $golf="yes";
    $total += 25;
  }

  if (isset($_POST["childcare"])) {
    $childcare="yes";
    $total += 100;
  }

  if (isset($_POST["personaltrainer"])) {
    $personaltrainer="yes";
    $total += 120;
  }

  if (isset($_POST["swimmingpool"])) {
    $swimmingpool="yes";
    $total += 20;
  }


  $total += $total * $tax;
}

?>


<!--
  IS-3003-30463
  Assignment 4
  Kaden Scroggins
-->

<html>
<head>
<title> Assignment 4 </title>
<script>
function reloadForm() {
  document.getElementById("healthClubForm").submit();
}
</script>
</head>

<body style="padding:15px;">
<form method="post" name="healthClubForm" id="healthClubForm" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
<h2> PHP Health Club Calculator </h2>
<p> Kaden Scroggins </p>

<div style="float:left; width:120px">
  <dl>
    <dt> Membership </dt>
    <dt><input type="radio" name="membership" value="basic" onchange="reloadForm()"
      <?php if (isset($membership) && $membership=="basic") echo "checked";?>
      > Basic </dt>
    <dt><input type="radio" name="membership" value="gold" onchange="reloadForm()"
      <?php if (isset($membership) && $membership=="gold") echo "checked";?>
      > Gold </dt>
    <dt><input type="radio" name="membership" value="goldplus" onchange="reloadForm()"
      <?php if (isset($membership) && $membership=="goldplus") echo "checked";?>
      > Gold Plus </dt>
  </dl>
</div>

<div style="float:left; width:160px">
  <dl>
    <dt>Additional Charges (1)</dt>
    <dt><input type="checkbox" name="tennis" onchange="reloadForm()"
      <?php if (isset($tennis) && $tennis=="yes") echo "checked";?>
      > Tennis </dt>
    <dt><input type="checkbox" name="racquetball" onchange="reloadForm()"
      <?php if (isset($racquetball) && $racquetball=="yes") echo "checked";?>
      > Racquetball </dt>
    <dt><input type="checkbox" name="golf" onchange="reloadForm()"
      <?php if (isset($golf) && $golf=="yes") echo "checked";?>
      > Golf </dt>
  </dl>
</div>

<div style="float:left; width:160px">
  <dl>
    <dt>Additional Charges (2)</dt>
    <dt><input type="checkbox" name="childcare" onchange="reloadForm()"
      <?php if (isset($childcare) && $childcare=="yes") echo "checked";?>
      > Child Care </dt>
    <dt><input type="checkbox" name="personaltrainer" onchange="reloadForm()"
      <?php if (isset($personaltrainer) && $personaltrainer=="yes") echo "checked";?>
      > Personal Trainer </dt>
    <dt><input type="checkbox" name="swimmingpool" onchange="reloadForm()"
      <?php if (isset($swimmingpool) && $swimmingpool=="yes") echo "checked";?>
      > Swimming Pool </dt>
  </dl>
</div>

<div style="clear:both">&nbsp;</div>

<div style="float:left; width:120px">
  <dl>
    <dt><input type="submit" value="Calculate Total"></dt>
  </dl>
</div>

<div style="float:left; width:160px">
  <dl>
    <dt>Tax: &nbsp;&nbsp;<input type="text" name="tax" size="10" onchange="reloadForm()" value=
      "<?php echo $tax;?>"
      ></dt>
    <dt>Total: <input type="text" readonly="true" name="total" size="10" value=
      "$<?php echo number_format((float)$total, 2, '.', '');?>"
      ></dt>
  </dl>
</div>

</form>
</body>
</html>