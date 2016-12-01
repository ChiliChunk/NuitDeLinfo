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

function toRadians (angle) {
	return angle * (Math.PI / 180);
}

function onclick_page(event) {
	var xCurs = event.clientX;
	var yCurs = event.clientY;
	var image = document.getElementById("eyeLeft");
	var posx = $(image).position().left;
	var posy = $(image).position().top;
	var difX = Math.abs(xCurs - posx);
	var difY = Math.abs(yCurs - posy);
	var tanAngle = difX/difY;
	//conversion rad
	var angle = Math.atan(tanAngle)*180/Math.PI;
	if (xCurs > posx){
		angle = -angle;
	}
	image.style.transform = "rotate("+angle+"deg)";
}
