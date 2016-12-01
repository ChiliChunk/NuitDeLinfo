<?php
	function multiple($taille){
		$result = "";
		$result .= "<table border=1>";
		for($i=0; $i<=$taille; $i++){
			$result .= "<tr>";
			for ($j=0; $j<=$taille; $j++){
				$result .= "<td>";
				if ($i != 0 && $j != 0) {
					$result .= ($i * $j);
				}
				elseif($i == 0 && $j != 0){
					$result .= "<b>$j</b>";
				}
				elseif($j == 0 && $i != 0){
					$result .= "<b>$i</b>";
				}
				else{
					$result .= "<b>X</b>";
				}
				$result .= "</td>";
			}
			$result .= "</tr>";
		}
		$result .= "</table>";
		return $result;
	}
?>