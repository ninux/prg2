package testgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonListener implements ActionListener{
	private SwitchGUI gui;

	public ButtonListener(SwitchGUI gui){
		this.gui = gui;
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == gui.on){
			gui.state.setText("The switch is on.");
		}
		if(e.getSource() == gui.off){
			gui.state.setText("The switch is off.");
		}
	}
}
