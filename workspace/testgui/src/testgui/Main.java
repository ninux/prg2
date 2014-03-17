/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testgui;

/**
 *
 * @author ninux
 */
public class Main {
	public static void main(String[] args){
		SwitchGUI sg = new SwitchGUI();
		ButtonListener bl = new ButtonListener(sg);
	}
}
