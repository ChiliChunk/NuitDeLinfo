import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

public class CustomPanel extends JPanel {
	List<CustomButton> alCustomButton = new ArrayList<CustomButton>();
	
	public CustomPanel(){
		int i = 0;
		int nbPerdant = 0;
		
		this.setLayout(new GridLayout(2, 2));
		
		while (i<4){
			int temp = (int)Math.random();
			if(!estDejaPresent(Integer.toString(temp))){
				if(nbPerdant<2){
					CustomButton ButtonTemp = new CustomButton(true, Integer.toString(temp));
					this.actionLister(ButtonTemp);
					this.alCustomButton.add(ButtonTemp);
					this.add(ButtonTemp);
					nbPerdant++;
				}
				else{
					CustomButton ButtonTemp = new CustomButton(false, Integer.toString(temp));
					this.actionLister(ButtonTemp);
					this.alCustomButton.add(ButtonTemp);
					this.add(ButtonTemp);
				}
				i++;
				
			}
		}
	}
	
	public boolean estDejaPresent(String aTester){
		for(int j=0; j<this.alCustomButton.size();j++){
			if(this.alCustomButton.get(j).getText().equals(aTester)){
				return true;
			}
		}
		return false;
	}
	
	public void actionLister(CustomButton pCustomButton){
		pCustomButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				if(!pCustomButton.estPerdant()){
					pCustomButton.setBackground(Color.GREEN);
				}
				for(int i=0; i<alCustomButton.size();i++){
					if(alCustomButton.get(i).estPerdant()){
						alCustomButton.get(i).setBackground(Color.RED);
					}
				}
				
			}
		});
	}
}
