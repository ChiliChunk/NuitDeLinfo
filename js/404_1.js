function toggleSun() {
	var music = document.getElementById("music");
	if (music.paused) {
		music.play();
	}
    else {
		music.pause();
	}
  document.getElementById("sun").classList.toggle("move");
}

var nbLeft, nbMiddle,nbRight = false;

function killNumberLeft() { document.getElementById("number_left").className += "kill"; nbLeft = true; areTheyDown() }

function killNumberMiddle() { document.getElementById("number_middle").className += "kill"; nbMiddle = true; areTheyDown() }

function killNumberRight() { document.getElementById("number_right").className += "kill"; nbRight = true; areTheyDown() }

function areTheyDown() {
	if(nbLeft == true && nbMiddle == true && nbRight == true) {
		window.setTimeout(function(){ window.location = "https://www.google.fr/"; },1000);
	}
}

function reload() {

	location.reload();

}
