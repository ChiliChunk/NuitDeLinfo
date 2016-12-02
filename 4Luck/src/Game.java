import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Game extends JFrame {
	
	private Joueur[] joueurs;
	private JPanel contenuManche;
	
	public Game (int nbJoueur){
		super("4Luck");
		this.joueurs = new Joueur[nbJoueur];
		contenuManche = new JPanel(new GridLayout(2,2));
        this.setContentPane(panneauDeContenu());
    	this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    	
    	for(int i=0;i<joueurs.length;i++){
    		joueurs[i] = new Joueur("Joueur "+(i+1));
    	}
    	
        this.setVisible(true);
        this.setLocationRelativeTo(null);
		
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent arg0) {
            	
                quitter();
                }
            });
        
		
	}
	/**
	 * Methode permettant de quitter la partie
	 */
	private void quitter() {
		int confirmation;
		confirmation = JOptionPane.showConfirmDialog(this, "Voulez-vous reellement quitter la partie", "Quitter ?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if ( confirmation==JOptionPane.YES_OPTION ) {
			dispose();
		}

	}
	
	public void lancerManche(){
		Manche uneManche = new Manche(joueurs);
		
	}
	
	private JPanel panneauDeContenu() {
		if(this.joueurs.length==1){
            this.setMinimumSize(new Dimension(200,200));
    	}
    	else{
            this.setMinimumSize(new Dimension(125*this.joueurs.length,125*this.joueurs.length));
    	}
		
		return contenuManche;
	}
	public JPanel getContenuManche() {
		return contenuManche;
	}
	public void setContenuManche(JPanel contenuManche) {
		this.contenuManche = contenuManche;
	}
}
