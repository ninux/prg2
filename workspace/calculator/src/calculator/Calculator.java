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

package calculator;

import static gpl.GPL.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author ninux
 */
public class Calculator extends Frame implements WindowListener {
	// Sizes of the window
	final static int HEIGTH = 250;
	final static int LENGTH = 210;
	
	// Number buttons
	Button btn_zero = new Button("0");
	Button btn_one = new Button("1");
	Button btn_two = new Button("2");
	Button btn_three = new Button("3");
	Button btn_four = new Button("4");
	Button btn_five = new Button("5");
	Button btn_six = new Button("6");
	Button btn_seven = new Button("7");
	Button btn_eigth = new Button("8");
	Button btn_nine = new Button("9");
	
	// Operation buttons
	Button btn_divide = new Button("/");
	Button btn_multiply = new Button("x");
	Button btn_add = new Button("+");
	Button btn_subtract = new Button("-");
	Button btn_square = new Button("x" + "\u00b2");
	Button btn_sign = new Button("\u00B1");
	Button btn_result = new Button("=");
	
	// Special function buttons
	Button btn_clear = new Button("C");
	Button btn_info = new Button("Info");
	
	// Textfield
	TextField txt = new TextField("I can't calculate things!");
	
	// Panel for buttons
	GridLayout gl = new GridLayout(5, 4);
	Panel keyboard = new Panel(gl);
	
	public Calculator(){
		super("Ninux' Calculator");
		setSize(HEIGTH, LENGTH);
		setResizable(false);
		setLayout(new BorderLayout());
		
		txt.setEditable(false);
		txt.setBackground(Color.WHITE);
		
		add(txt, BorderLayout.NORTH);
		add(btn_info, BorderLayout.SOUTH);
		
		keyboard.add(btn_seven);
		keyboard.add(btn_eigth);
		keyboard.add(btn_nine);
		keyboard.add(btn_multiply);
		keyboard.add(btn_four);
		keyboard.add(btn_five);
		keyboard.add(btn_six);
		keyboard.add(btn_divide);
		keyboard.add(btn_one);
		keyboard.add(btn_two);
		keyboard.add(btn_three);
		keyboard.add(btn_subtract);
		keyboard.add(btn_zero);
		keyboard.add(btn_sign);
		keyboard.add(btn_result);
		keyboard.add(btn_add);
		keyboard.add(btn_clear);
		keyboard.add(btn_square);
		
		add(keyboard, BorderLayout.CENTER);
		
		addWindowListener(this);
		
		ButtonListener bl = new ButtonListener(this);
		btn_zero.addActionListener(bl);
		btn_one.addActionListener(bl);
		btn_two.addActionListener(bl);
		btn_three.addActionListener(bl);
		btn_four.addActionListener(bl);
		btn_five.addActionListener(bl);
		btn_six.addActionListener(bl);
		btn_seven.addActionListener(bl);
		btn_eigth.addActionListener(bl);
		btn_nine.addActionListener(bl);
		
		btn_divide.addActionListener(bl);
		btn_multiply.addActionListener(bl);
		btn_add.addActionListener(bl);
		btn_subtract.addActionListener(bl);
		btn_square.addActionListener(bl);
		btn_sign.addActionListener(bl);
		btn_result.addActionListener(bl);
		
		btn_clear.addActionListener(bl);
		btn_info.addActionListener(bl);
		
		setVisible(true);
	}

	@Override
	public void windowOpened(WindowEvent we) {
		
	}

	@Override
	public void windowClosing(WindowEvent e) {                  
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent we) {
		
	}

	@Override
	public void windowIconified(WindowEvent we) {
		
	}

	@Override
	public void windowDeiconified(WindowEvent we) {
		
	}

	@Override
	public void windowActivated(WindowEvent we) {
		
	}

	@Override
	public void windowDeactivated(WindowEvent we) {
		
	}
	
}