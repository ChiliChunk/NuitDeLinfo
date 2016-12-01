<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8" />
	<link rel="stylesheet" href="./include/styles.css" />
	<title>Mon site : AffecterCategories</title>
</head>
<body>
	<?php 
		// Index.php
		include("./include/header.php"); 
	?>
	<div class="wrapper">
		<?php include("./include/menus.php"); ?>
		<section id="content">
			<h2>AffecterCategories : </h2>

            <?php
	
			$sexe = "H";
			$age = 20;
			$poids = 65;
			$categorie;
			
			if($sexe == "F")
			{
				$genre = "Femme";
			}
			else
			{
				$genre = "Homme";
			}
			
			$categorie = $age >=21 ? "Senior": "Junior";
			
			
			switch($poids)
			{
				case($poids <= 60):
					$categorie = "Super léger";
					break;
				case($poids > 60 && $poids < 100):
					$categorie = "Mi léger et un peu plus";
					break;
				case($poids > 100):
					$categorie = "Lourds";
					break;
				default :
					$categorie = "unknow";
					break;
			}
		
			echo "<h1> TD1 : </h1>";
			
			echo "$genre $categorie"
		
		?>

		</section>
	</div>
	<?php include("./include/footer.php"); ?>
</body>
</html>
