import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class OneOFour extends JFrame {
	
	//private ArrayList<Score> listeHS;
	
	/**
	 * Constructeur par défaut.
	 * Créer une fenètre de nom stagio et initialise la liste d'entreprise affiché Ã  celle de StockDonnees
	 */
	public OneOFour (){
		super("4Luck");
        this.setContentPane(panneauDeContenu());
    	this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.setMinimumSize(new Dimension(400,300));
        this.setVisible(true);
        this.setLocationRelativeTo(null);
		
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent arg0) {
            	
                quitter();
                }
            });
		
	}
	
	/**
	 * Methode permettant de quitter l'application
	 */
	private void quitter() {
		int confirmation;
		confirmation = JOptionPane.showConfirmDialog(this, "Voulez-vous reellement quitter l'application ?", "Quitter ?",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if ( confirmation==JOptionPane.YES_OPTION ) {
			dispose();
		}

	}

	private JPanel panneauDeContenu() {
		JPanel allInThis = new JPanel();
		

		
		
		
		JPanel barreSelec=new JPanel();
		JButton unJoueur=new JButton("1 Joueur");
		JButton deuxJoueur=new JButton("2 Joueurs");
		JButton quatreJoueur=new JButton("4 Joueurs");
		unJoueur.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Game(1);
				}
		});
		
		deuxJoueur.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Game(2);
				}
		});
		
		quatreJoueur.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new Game(4);
				}
		});
		barreSelec.add(unJoueur);
		barreSelec.add(deuxJoueur);
		barreSelec.add(quatreJoueur);
		

		//allInThis.add(listeHS,BorderLayout.CENTER);
		allInThis.add(barreSelec,BorderLayout.SOUTH);
		return allInThis;
	}
}
