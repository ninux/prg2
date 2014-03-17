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

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ButtonListener implements ActionListener{
	private Calculator gui;
	private Computer cp = new Computer();

	public ButtonListener(Calculator gui){
		this.gui = gui;
	}
	
	public void actionPerformed(ActionEvent event){
		if(event.getSource() == gui.btn_zero){
			cp.setOperand(0);
			gui.txt.setText(String.valueOf(cp.getAccu()));
		}
		if(event.getSource() == gui.btn_one){
			cp.setOperand(1);
			gui.txt.setText(String.valueOf(cp.getAccu()));
		}
		if(event.getSource() == gui.btn_two){
			cp.setOperand(2);
			gui.txt.setText(String.valueOf(cp.getAccu()));
		}
		if(event.getSource() == gui.btn_three){
			cp.setOperand(3);
			gui.txt.setText(String.valueOf(cp.getAccu()));
		}
		if(event.getSource() == gui.btn_four){
			cp.setOperand(4);
			gui.txt.setText(String.valueOf(cp.getAccu()));
		}
		if(event.getSource() == gui.btn_five){
			cp.setOperand(5);
			gui.txt.setText(String.valueOf(cp.getAccu()));
		}
		if(event.getSource() == gui.btn_six){
			cp.setOperand(6);
			gui.txt.setText(String.valueOf(cp.getAccu()));
		}
		if(event.getSource() == gui.btn_seven){
			cp.setOperand(7);
			gui.txt.setText(String.valueOf(cp.getAccu()));
		}
		if(event.getSource() == gui.btn_eigth){
			cp.setOperand(8);
			gui.txt.setText(String.valueOf(cp.getAccu()));
		}
		if(event.getSource() == gui.btn_nine){
			cp.setOperand(9);
			gui.txt.setText(String.valueOf(cp.getAccu()));
		}
		if(event.getSource() == gui.btn_add){
			cp.setOperator("+");
			gui.txt.setText(cp.getOperator());
		}
		if(event.getSource() == gui.btn_subtract){
			cp.setOperator("-");
			gui.txt.setText(cp.getOperator());
		}
		if(event.getSource() == gui.btn_multiply){
			cp.setOperator("*");
			gui.txt.setText(cp.getOperator());
		}
		if(event.getSource() == gui.btn_divide){
			cp.setOperator("/");
			gui.txt.setText(cp.getOperator());
		}
		if(event.getSource() == gui.btn_square){
			cp.square();
			gui.txt.setText(String.valueOf(cp.getAccu()));
		}
		if(event.getSource() == gui.btn_sign){
			cp.changeSign();
			gui.txt.setText(String.valueOf(cp.getAccu()));
		}
		if(event.getSource() == gui.btn_result){
			cp.calculate();
			gui.txt.setText(String.valueOf(cp.getAccu()));
		}
		if(event.getSource() == gui.btn_clear){
			cp.resetComputer();
			gui.txt.setText("");
		}
		if(event.getSource() == gui.btn_info){
			gui.txt.setText("\u00a9" + " Copyright by Ninux, GNU GPLv3");
		}
		
	}
}
