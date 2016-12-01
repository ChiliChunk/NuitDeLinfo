<?php
	try { 
		$conn = new PDO('mysql:host=localhost;dbname=base_tbouete;charset=UTF8'
					,'tbouete', '40sonperco', array(PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION));
	}
	catch (PDOException $e) {
		echo "Erreur: ".$e->getMessage()."<br/>" ;
		die() ;
	}
	function CreerProjet($nom){
		$nbr = 'SELECT COUNT(*) FROM PROJET';
		$req = 'INSERT INTO PROJET VALUE ($nbr,$nom)';
		$reponse = $conn->query($req); 
	}
	function afficherProjets(){
		$req = 'SELECT * FROM PROJET';
		$reponse = $conn->query($req);
		while ($donnees = $reponse->fetch()) {
			echo "<li><input type=\"submit\" name=\"projet\" value=\"".$donnees['nom']."\" /></li>";
		}
	}
?>