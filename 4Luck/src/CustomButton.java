import javax.swing.JButton;

public class CustomButton extends JButton {
	private boolean perdant;
	
	public CustomButton(){
		this.perdant = false;
		this.setText("");
	}
	
	public CustomButton(boolean perdant, String display){
		this.perdant = perdant;
		this.setText(display);
	}
	
	public boolean estPerdant(){
		return this.perdant;
	}
}


