<?php
$rand = rand(1,5);
?>
<html>
<head>
	<title>Assignment 13</title>
</head>
<body style="padding:12px">
	<h2>Assignment 13 (PHP)</h2>
	Kaden Scroggins <br><br>
	Display random pictures on a website.<br>
	Reload the webpage to view different pictures.<br>
	Random number generated: <?php echo $rand;?> <br><br>
	<?php echo ('<img width="500px" src="bread/bread' . $rand . '.jpg">');?>
</body>
</html>