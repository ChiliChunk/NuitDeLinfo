import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JPanel;

public class CaseJeu extends JPanel{
	
	private boolean estCoche;
	private int cptPoint;
	private int cptVie;
	
	public CaseJeu (){
        this.add(panneauDeContenu());
        this.setMinimumSize(new Dimension(80,80));
        this.setVisible(true);
        this.cptPoint=0;
        this.cptVie=3;
		
	}

	private JPanel panneauDeContenu() {
		JPanel allInThis=new JPanel(new GridLayout(2,2));
		JButton case1 = new JButton("1");
		JButton case2 = new JButton("2");
		JButton case3 = new JButton("3");
		JButton case4 = new JButton("4");
		
		case1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				case1.setBackground(Color.BLACK);
				case2.setEnabled(false);
				case3.setEnabled(false);
				case4.setEnabled(false);
				
				setEstCoche(true);
				}
		});

		case2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				case2.setBackground(Color.BLACK);
				case1.setEnabled(false);
				case3.setEnabled(false);
				case4.setEnabled(false);
				
				setEstCoche(true);
				}
		});

		case3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				case3.setBackground(Color.BLACK);
				case1.setEnabled(false);
				case2.setEnabled(false);
				case4.setEnabled(false);
				
				setEstCoche(true);
				}
		});
		

		case4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				case4.setBackground(Color.BLACK);
				case3.setEnabled(false);
				case2.setEnabled(false);
				case1.setEnabled(false);
				
				setEstCoche(true);
				}
		});
		
		
		ButtonGroup touteCases=new ButtonGroup();
		touteCases.add(case1);
		touteCases.add(case2);
		touteCases.add(case3);
		touteCases.add(case4);
		
		allInThis.add(case1);
		allInThis.add(case2);
		allInThis.add(case3);
		allInThis.add(case4);
		return allInThis;
	}

	public boolean isEstCoche() {
		return estCoche;
	}

	public void setEstCoche(boolean estCoche) {
		this.estCoche = estCoche;
	}
}
