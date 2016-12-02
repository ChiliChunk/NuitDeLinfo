<!DOCTYPE html>
<?php  
	require_once("../fonctions.php");
    require_once("./connect.inc.php"); 
	  ?>
<html>
<head>
	<meta charset="utf-8" />
	<link rel="stylesheet" href="./styles.css" />
	<title>Nouveau Projet</title>
</head>
<body>
  <form action="newProjet.php" method="POST">
    Nom du Projet :
    <input type="text" name="nametext" />
    <input type="submit" name="confirm" />
  </form>
  <?php
    if (!empty($_POST['nametext']) AND isset($_POST['nametext'])) {
      CreerProjet($conn,$_POST['nametext']);
      header('location:../index.php');
    }

   ?>
</body>
</html>
