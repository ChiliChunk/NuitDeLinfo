import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Game extends JFrame {
	private int size;
	public Game (int nbJoueur){
		super("4Luck");
		this.size=nbJoueur;
        this.setContentPane(panneauDeContenu());
    	this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    	if(this.size==1){
            this.setMinimumSize(new Dimension(200,200));
    	}
    	else{
            this.setMinimumSize(new Dimension(125*this.size,125*this.size));
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
	private JPanel panneauDeContenu() {
		JPanel allInThis=new JPanel(new GridLayout(2,2));
		for(int i=0;i<this.size;i++){
			allInThis.add(new CaseJeu());
		}
		return allInThis;
	}
}
