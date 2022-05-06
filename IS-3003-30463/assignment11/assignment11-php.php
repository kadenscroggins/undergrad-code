<?php
$completeName = "";
$nameBits = [];
$tempStr = "";

function test_input($data) {
  $data = trim($data);
  $data = stripslashes($data);
  $data = htmlspecialchars($data);
  return $data;
}

if ($_SERVER["REQUEST_METHOD"] == "POST") {
	if (!empty($_POST["completeName"])) {
		$completeName = test_input($_POST["completeName"]);
	}
	$nameBits = explode(" ", $completeName);

		if (sizeof($nameBits) == 2) {
			$tempStr = "First name: " . $nameBits[0] . "\n";
			$tempStr = $tempStr . "It contains " . strlen($nameBits[0]) . " characters.\n\n";
			$tempStr = $tempStr . "Last name: " . $nameBits[1] . "\n";
			$tempStr = $tempStr . "It contains " . strlen($nameBits[1]) . " characters.\n\n";
		}
		else if (sizeof($nameBits) == 3) {
			$tempStr = "First name: " . $nameBits[0] . "\n";
			$tempStr = $tempStr . "It contains " . strlen($nameBits[0]) . " characters.\n\n";
			$tempStr = $tempStr . "Middle name: " . $nameBits[1] . "\n";
			$tempStr = $tempStr . "It contains " . strlen($nameBits[1]) . " characters.\n\n";
			$tempStr = $tempStr . "Last name: " . $nameBits[2] . "\n";
			$tempStr = $tempStr . "It contains " . strlen($nameBits[2]) . " characters.\n\n";
		}
		else {
			$tempStr = "Invalid number of names!";
		}
}

?>

<html>
<head>
	<title>String Manipulation: PHP</title>
</head>
<body style="padding:30px;">
	<h2>String Manipulation: PHP</h2>
	<p>Kaden Scroggins</p>

	<form method="post" action="<?php echo htmlspecialchars($_SERVER["PHP_SELF"]);?>">
		<p>Name: <input type="text" name="completeName" value="<?php echo $completeName;?>"></p>
		<p><input type="submit" value="Extract Name"></p>
		<textarea name="results" rows="8" cols="50"><?php echo $tempStr;?></textarea>
	</form>
</body>
</html>