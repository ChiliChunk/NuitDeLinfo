function playMusic() {
	var music = document.getElementById("music");
	if (music.paused) {
		music.play();
	}
    else {
		music.pause();
	}
}

function toggleSun() { document.getElementById("sun").classList.toggle("move"); makeItRain(); playMusic();}

var nbLeft, nbMiddle,nbRight = false;

function killNumberLeft() { document.getElementById("number_left").className += "kill"; document.getElementById("eyeLeft").className += "kill"; nbLeft = true; areTheyDown() }

function killNumberMiddle() { document.getElementById("number_middle").className += "kill"; nbMiddle = true; areTheyDown() }

function killNumberRight() { document.getElementById("number_right").className += "kill"; document.getElementById("eyeRight").className += "kill"; nbRight = true; areTheyDown() }

function areTheyDown() {
	if(nbLeft == true && nbMiddle == true && nbRight == true) {
		window.setTimeout(function(){ window.location = "https://www.google.fr/"; }, 1000);
	}
}

function toRadians (angle) { return angle * (Math.PI / 180); }

function mouseMouve(event) { rotateEye(event, "eyeLeft"); rotateEye(event, "eyeRight"); }

function rotateEye(event, eye) {
	var xCurs = event.clientX;
	var yCurs = event.clientY;
	var image = document.getElementById(eye);
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
	if (yCurs < posy){
		angle = angle -180;
		angle = -angle;
	}
	image.style.transform = "rotate("+angle+"deg)";
}

function makeItRain(){
		$(this).on('click',function(){
			var maxBills = 50;
			for (var i = 0; i < maxBills; i++){
			var random = $(window).width();
			var randomPosition = Math.floor(random*Math.random());
			var randomTime = Math.random() * 20;
			var randomSpeed = (Math.random()*20)+10 ;
			var bills = $("<span class='billsBillsBills'>")
				.css({
					left : randomPosition,
					top: '-150px',
					"-webkit-animation-delay" : randomTime + "s",
					"-webkit-animation-duration" : randomSpeed + "s"
				});
				$(bills).prepend('<img src="img/bill.svg" alt="a dollar bill">');
				$('body').append(bills);
			}; // end click function
		}); //end for loop
	}; //end make it rain fn.
// thanks to Anisha Varghese from the Noun Project for the SVG!!
