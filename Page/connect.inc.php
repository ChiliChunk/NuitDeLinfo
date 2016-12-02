<?php
 try {
   $conn = new PDO('mysql:host=localhost;dbname=base_tbouete;charset=UTF8'
         ,'tbouete', '40sonperco', array(PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION));
 }
 catch (PDOException $e) {
   echo "Erreur: ".$e->getMessage()."<br/>" ;
   die() ;
 }
  ?>
