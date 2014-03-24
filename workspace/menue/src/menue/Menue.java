/*
 * Copyright (C) 2014 ninux
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package menue;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author ninux
 */
public class Menue extends JFrame{

	public Menue(){
		super("A Menue Bar App");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menuFile = new JMenu("File");
		JMenu menuHelp = new JMenu("Help");
		JMenuItem menuItemExit = new JMenuItem("Exit");
		JMenuItem menuItemAbout = new JMenuItem("About");
		
		menuItemExit.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent event){
					onExitPressed();
				}
			}
		);
		
		menuItemAbout.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent event){
					onAboutPressed();
				}
			}
		);
		
		menuFile.add(menuItemExit);
		menuHelp.add(menuItemAbout);
		
		menuBar.add(menuFile);
		menuBar.add(menuHelp);
		
		setJMenuBar(menuBar);
		
		pack();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		JFrame frame = new Menue();
	}
	
	private void onExitPressed(){
		System.exit(0);
	}
	
	private void onAboutPressed(){
		JOptionPane.showMessageDialog(this,
			"Copyright 2014, ninux, GPLv3" 
			+ "\n\nVisit https://github.com/ninux/prg2");
	}
	
}