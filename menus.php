<?php  require_once("./fonctions.php");
      require_once("./Page/connect.inc.php"); ?>
<nav class="sidebar">
<!-- Menus.php -->

 <ul>
   <form action="index.php" method="POST">

 <?php
    afficherProjets($conn);
	?>
  </form>
  <a href="./Page/newProjet.php"><input type="submit" name="newprojet" value="Nouveau projet" /></a>

  </ul>

</nav>
