<!doctype html>
<html lang="fr">
	<meta charset="utf-8">
	<head>
		
		<link rel="stylesheet" href="./include/styles.css" />
		<title>Test Multiplie</title>
	</head>	
	<body>
		<?php 
			// Index.php
			include("./include/header.php"); 
		?>
		<div class="wrapper">
			<?php include("./include/menus.php"); ?>
			<section id="content">
				<?php
					require_once "fonctions.php";
					$afficher = multiple(10);
					echo $afficher;
				?>
			</section>
		</div>
	<?php include("./include/footer.php"); ?>
	</body>
	
</html>