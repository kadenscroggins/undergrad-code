<html>
<body style="padding:30px;">

<?php
include 'header.html';

$currentFileName = basename($_SERVER['PHP_SELF']);

$period = strpos ($currentFileName, ".");
$stateName = (substr ($currentFileName, 0, $period));

$imageName ="data/$stateName.jpg";
$imageData ="data/$stateName-data.txt";

$title = ucfirst($stateName);
echo "<h2> $title </h2>";

echo "<img src=\"$imageName\" alt=\"$stateName\" width=\"240\" height=\"150\">";
echo "<p>";
include "$imageData";
include 'footer.html';

echo "<title> $title </title>";
?>

</body>
</html>