function playMusic() {
	var music = document.getElementById("music");

	if (music.paused) {
		music.play();
	}
    else {
		music.pause();
	}
}
