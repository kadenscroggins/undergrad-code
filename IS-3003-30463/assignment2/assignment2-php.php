<!--
	IS-3003-30463
	Assignment 2 (PHP)
	Kaden Scroggins
-->

<title>Assignment 2 (PHP)</title>

<?php

$number1 = "";
$number2 = "";
$number3 = "";
$average = "";
$status = "";
$grade = "";


function test_input($data) {
	$data = trim($data);
	$data = stripslashes($data);
	$data = htmlspecialchars($data);
	return $data;
}

if ($_SERVER["REQUEST_METHOD"] == "POST") {

	if (!empty($_POST["number1"])) {
		$number1 = test_input($_POST["number1"]);
	}

	if (!empty($_POST["number2"])) {
		$number2 = test_input($_POST["number2"]);
	}

	if (!empty($_POST["number3"])) {
		$number3 = test_input($_POST["number3"]);
	}

	$average = ($number1+$number2+$number3)/3;

	if ($average >= 60) {
		$status = "Passing";
	}

	else {
		$status = "Failing";
	}

	if ($average >= 90) {
		$grade = "A";
	}

	else if ($average >= 80) {
		$grade = "B";
	}

	else if ($average >= 70) {
		$grade = "C";
	}

	else if ($average >= 60) {
		$grade = "D";
	}

	else {
		$grade = "F";
	}
}

?>

<h2> PHP Grade Calculator </h2>
Kaden Scroggins <p>

<form method="post" action="<?php echo htmlspecialchars($SERVER["PHP_SELF"]);?>">

Exam 1: <input type="text" name="number1" value="<?php echo $number1; ?>"> <p>
Exam 2: <input type="text" name="number2" value="<?php echo $number2; ?>"> <p>
Exam 3: <input type="text" name="number3" value="<?php echo $number3; ?>"> <p>
<input type="submit" value="Calculate Answer"> <p>

Average: <input type="text" name="average" value="<?php echo $average; ?>"> <p>
Status: <input type="text" name="average" value="<?php echo $status; ?>"> <p>
Grade: <input type="text" name="grade" value="<?php echo $grade; ?>"> <p>

</form>