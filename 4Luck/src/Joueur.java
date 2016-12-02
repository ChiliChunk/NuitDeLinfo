
public class Joueur {

	private String name;
	private int nbVie;
	private int score;
	private boolean alive;
	
	public Joueur(){
		this.name = "";
		this.nbVie = 3;
		this.score = 0;
		this.alive = true;
	}
	
	public Joueur(String name) {
		this.name = name;
		this.nbVie = 3;
		this.score = 0;
		this.alive = true;
	}
	
	public void perdreVie(){
		this.nbVie--;
		if(this.nbVie<1){
			this.alive = false;
		}
	}
	
	public void finManche(boolean gagner){
		if(gagner){
			this.score++;
		}
		else{
			perdreVie();
		}
	}
	
	public boolean estEnVie(){
		return this.alive;
	}

}
