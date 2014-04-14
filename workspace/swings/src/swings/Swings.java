/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swings;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextArea;

/**
 *
 * @author ninux
 */
public class Swings extends JFrame{

	private int numClicks = 0;
	
	public static void main(String[] args){
		JFrame frame = new Swings();
	}
	
	public Swings(){
		super("Swings");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton button = new JButton("Count button clicks");
		final JLabel label = new JLabel("Number of clicks: " + numClicks); // Why final???
				
		button.setBorder(BorderFactory.createLineBorder(Color.black));
		label.setBorder(BorderFactory.createLineBorder(Color.black));
		
		button.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent event){
					incrementClicks();
					label.setText("Number of clicks: " + numClicks);
				}
			}
		);
		
		//setLayout(new GridLayout(0, 1));
		setLayout(new FlowLayout(40, 20, 20));
		add(button);
		add(label);
		
		pack();
		setVisible(true);
	}
	
	private void incrementClicks(){
		numClicks++;	
	}
}
