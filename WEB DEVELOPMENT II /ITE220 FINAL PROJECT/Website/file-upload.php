<?php 

if (isset($_FILES["file"])){
    $file = $_FILES['file'];

    //file properties
    $file_name = $file['name'];
    $file_tmp = $file['tmp_name'];
    $file_size = $file['size'];

    //work out the file extension
    $file_ext = explode('.', $file_name);
    $file_ext = strtolower(end($file_ext));

    $allowed = array('txt', 'jpg', 'mp3', 'wav');

    if(in_array($file_ext, $allowed)) {
if($file_error ===0){
    if($file_size <= 1e+8){

        $file_name_new = uniqid('',true) . '.' . $file_ext;
        $file_destination = 'uploads/' . $file_name_new;

        if(move_uploaded_file($file_tmp, $file_destination)){
            echo "Thank You!" . " -" . "<a href='contact.html' style='text-decoration:none;color:#ff0099;'> Return Home</a>";


        }


    }
}

    }

}

