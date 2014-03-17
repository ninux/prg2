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

/**
 *
 * @author ninux
 */
public class Computer {
	// init operands and operator
	private int accu = 0;
	private int operand_A = 0;
	private int operand_B = 0;
	private String operator = "DEFAULT";
	
	// states of the operands and operator
	private boolean stat_opA = false;
	private boolean stat_opB = false;
	
	// status of calculation
	private boolean StausOfCalculation = false;
	
	public Computer(){
		operand_A = 0;
		operand_B = 0;
		operator = "DEFAULT";
		stat_opA = false;
		stat_opB = false;
	}
	
	public void setOperand(int decimal){
		if(accu < 1000){
			addDecimal(decimal);
		}
		else{
			// IGNORE INPUT
		}
	}
	
	public void addDecimal(int a){
		// add decimals
		accu = accu*10;
		accu = accu + a;
	}
	
	public void setOperator(String a){
		operator = a;
		operand_A = accu;
		accu = 0;
		stat_opA = true;
	}
	
	public String getOperator(){
		return operator;
	}
	
	public int calculate(){
		int result = 0;
		operand_B = accu;
		switch(operator){
			case "+": result = operand_A + operand_B;
				break;
			case "-": result = operand_A - operand_B;
				break;
			case "*": result = operand_A * operand_B;
				break;
			case "/": result = operand_A / operand_B;
				break;
			default: 
				break;
		}
		accu = result;
		return result;
	}
	
	public void square(){
		accu = accu*accu;
	}
	
	public void changeSign(){
		accu = accu*(-1);
	}
	
	public int getAccu(){
		return accu;
	}
	
	public void resetAccu(){
		accu = 0;
	}
	
	public void resetComputer(){
		accu = 0;
		operand_A = 0;
		operand_B = 0;
		operator = "DEFAULT";
	}
	
}
