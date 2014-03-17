package testgui;

import java.awt.*;

public class SwitchGUI extends Frame{
	Label state = new Label("The switch is off.");
	Button on = new Button("On");
	Button off = new Button("Off");
	
	public SwitchGUI(){
		add(on, BorderLayout.NORTH);
		add(state, BorderLayout.CENTER);
		add(off, BorderLayout.SOUTH);
		
		ButtonListener b1 = new ButtonListener(this);
		on.addActionListener(b1);
		off.addActionListener(b1);
		
		setVisible(true);
	}
}