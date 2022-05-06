<?php
$maxValue = 0;
$tempStr = "";

function test_input($data) {
  $data = trim($data);
  $data = stripslashes($data);
  $data = htmlspecialchars($data);
  return $data;
}

if ($_SERVER["REQUEST_METHOD"] == "POST") {
  
  if (!empty($_POST["maxValue"])) {

  	if (!empty($_POST["maxValue"])) {
  		$maxValue = test_input($_POST["maxValue"]);
  	}
  }
}

$tempStr = $tempStr . "Increasing Order: \n";
for ($i=0;$i<$maxValue;$i++) {
	$tempStr = $tempStr . ($i + 1) . " ";
}

$tempStr = $tempStr . "\n\nDecreasing Order:\n";
for ($i=$maxValue;$i>0;$i--) {
	$tempStr = $tempStr . $i . " ";
}

$tempStr = $tempStr . "\n\nEven Numbers:\n";
for ($i=0;$i<($maxValue-1);$i=$i+2) {
	$tempStr = $tempStr . ($i+2) . " ";
}

$tempStr = $tempStr . "\n\nSquare:\n";
for ($i=0;$i<$maxValue;$i++) {
	for ($k=0;$k<$maxValue;$k++) {
		$tempStr = $tempStr . "* ";
	}
	$tempStr = $tempStr . "\n";
}

$tempStr = $tempStr . "\n\nMultiplication Table:\n";
for ($i=1;$i<($maxValue+1);$i++) {
	$tempStr = $tempStr . $i . " * " . $i . " = " . ($i*$i) . "\n";
}

?>

<html>
<head>
<title> PHP: For Loop </title>
</head>

<body style="padding:0 0 0 30px;">

<h2> PHP: For Loop </h2>
<p> Kaden Scroggins </p>

<form method="post" name="introductionFor" id="introductionFor"
  action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">

<input type="text" name="maxValue" value="<?php echo $maxValue; ?>" />
<input type="submit" value="Display Results" /> <br />
<br />
<textarea name="results" rows="25" cols="50"><?php echo $tempStr; ?></textarea>

</form>

</body>

</html>