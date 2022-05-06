<?php
$savekey;
$jsonstring;
if (isset($_POST['savekey'])) {
	$savekey=$_POST["savekey"];
	if (isset($_POST['jsonstring'])) {
		$jsonstring=$_POST["jsonstring"];
		$myfile = fopen("data/".$savekey.".json", "w") or die("Unable to open file!");
		fwrite($myfile, $jsonstring);
		fclose($myfile);
	}
}
?>