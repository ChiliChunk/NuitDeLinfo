<?php

	function CreerProjet($conn,$nom){

		$nbr = 'SELECT * FROM PROJET';
		$reponse1 = $conn->prepare($nbr);
		$reussite = $reponse1->execute();
		$nb = 0;
		while ($donnees = $reponse1->fetch()) {
			$nb = $nb + 1;
		}
		
		if($reussite){
			echo "Done</BR>";
		}
	
		var_dump($nb);

		
		$req = 'INSERT INTO PROJET VALUES (:ID,:NOM)';

		$reponse2 = $conn->prepare($req);
		$reponse2->execute(array('ID' => $nb, 'NOM' => $nom ));
		$idNouveau = $conn->lastInsertId();
	}

	function afficherProjets($conn){
		$req = 'SELECT * FROM PROJET';
		$reponse = $conn->prepare($req);
		$reponse->execute();
		while ($donnees = $reponse->fetch()) {
			echo '<a href="#"><li><input type="submit" name="projet" value="'.$donnees['NOMPROJET'].'" /></li></a>';
		}
	}

	function creerMembre($conn,$nom,$idproj){
		$nbr = "SELECT COUNT(*) FROM PERSONNE";
		$reponse1 = $conn->prepare($nbr);
		$reussite = $reponse1->execute();
		
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
