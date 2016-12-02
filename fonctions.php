<?php

	function CreerProjet($conn,$nom){

		$nbr = 'SELECT COUNT(*) FROM PROJET';
		$req = 'INSERT INTO PROJET VALUES ($nbr,$nom)';

		$reponse = $conn->prepare($req);
		$reponse->execute(array('PROJET'));
		$idNouveau = $conn->lastInsertId();
	}

	function afficherProjets($conn){
		$req = 'SELECT * FROM PROJET';
		$reponse = $conn->query($req);
		while ($donnees = $reponse->fetch()) {
			echo '<a href="#"><li><input type="submit" name="projet" value="'.$donnees['NOMPROJET'].'" /></li></a>';
		}
	}

	function creerMembre($conn,$nom,$idproj){
		$nbr = "SELECT COUNT(*) FROM PERSONNE";
		$req = "INSERT INTO PERSONNE VALUES($nbr,$nom,0,$idproj)";
		$reponse = $conn->query($req);
	}

	function creerAchat($conn,$nom,$idproj){
		$nbr = 'SELECT COUNT(*) FROM ACHAT';
		$req = 'INSERT INTO ACHAT VALUES($nbr,$nom,$idproj)';
		$reponse = $conn->query($req);
		header('Location : ./Page/Participants.php');
	}
?>
