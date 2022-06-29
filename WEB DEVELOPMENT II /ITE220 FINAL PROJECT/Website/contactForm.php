<?php 
$cname = $_POST['cName'];
$cemail = $_POST['cEmail'];
$cmessage = $_POST['cMessage'];
$formcontent="From: $cname \n Message: $cmessage";
$recipient = "1710240005@students.stamford.edu";
$subject = "Contact Form";
$mailheader = "From: $cemail \r\n";
mail($recipient, $subject, $formcontent, $mailheader) or die("Error!");
echo "Thank You!" . " -" . "<a href='contact.html' style='text-decoration:none;color:#ff0099;'> Return Home</a>";
?>
