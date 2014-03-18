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
 * Computer for simple calculations.
 * @author ninux
 */
public class Computer {
	/**
	 * Initialise default values for accumulator, operator and operands.
	 */
	private static final int ACCU_DEFAULT = 0;
	private static final int OPERAND_DEFAULT = 0;
	private static final String OPERATOR_DEFAULT = "DEFAULT";
	private static final boolean STATUS_OPERAND_DEFAULT = false;
	private static final int MEMORY_DEFAULT = 0;
	private static final boolean STATUS_CALCULATION_DEFAULT = false;
	
	/**
	 * Initialise maximal and minimal values.
	 */
	private static final int MAX_OPERAND = 9999;
	private static final int MAX_ACCU = MAX_OPERAND*MAX_OPERAND;
	private static final int MIN_ACCU = MAX_ACCU*(-1);
	
	/**
	 * Initialise fields for accumulator, operator and operands
	 */
	private int accu = ACCU_DEFAULT;
	private int operand_A = OPERAND_DEFAULT;
	private int operand_B = OPERAND_DEFAULT;
	private String operator = OPERATOR_DEFAULT;
	private int memory = MEMORY_DEFAULT;
	private boolean stat_opA = STATUS_OPERAND_DEFAULT;
	private boolean StausOfCalculation = STATUS_CALCULATION_DEFAULT;
	
	/**
	 * Default constructor 
	 */
	public Computer(){
		resetComputer();	// force a clean setup
	}
	
	/**
	 * Set the next decimal value of the operand.
	 * @param decimal 
	 */
	public void setOperand(int decimal){
		if(accu < MAX_OPERAND){		// prevent overflows
			addDecimal(decimal);	
		}
		else{
			// IGNORE INPUT
		}
	}
	
	/**
	 * Add a decimal vlaue to the accumulator.
	 * @param a 
	 */
	public void addDecimal(int a){
		accu = accu*10;		// increment accumulator by one decade
		accu = accu + a;	// add new decimal as least significant
	}
	
	/**
	 * Set the operator a for the calculation.
	 * @param a 
	 */
	public void setOperator(String a){
		operator = a;		// take the operator
		operand_A = accu;	// fix the operand A
		stat_opA = true;	// mark operand status
		resetAccu();		// reset the accumulator
	}
	
	/**
	 * Return the operator of the current calculation.
	 * @return 
	 */
	public String getOperator(){
		return operator;
	}
	
	/**
	 * Resturns the result of the given operands and operator.
	 * @return 
	 */
	public int calculate(){
		int result = 0;		// initialise local accumulator
		operand_B = accu;	// fix operand B
		
		switch(operator){
			case "+": result = operand_A + operand_B;
				break;
			case "-": result = operand_A - operand_B;
				break;
			case "*": result = operand_A * operand_B;
				break;
			case "/": 
				if(operand_B != 0){
					result = operand_A / operand_B;
				}
				else{
					// DIVISION BY ZERO NOT ALLOWED
				}
				break;
			default: result = accu;
				break;
		}
		if(result > MAX_ACCU || result < MIN_ACCU){
			// DO NOT CHANGE ACCUMULATOR TO PREVENT OVERFLOW!
		}
		else{
			accu = result;		// save result to accumulator
		}
		return accu;
	}
	
	/**
	 * Change the sign of the accumulator.
	 */
	public void changeSign(){
		accu = accu*(-1);
	}
	
	/**
	 * Retruns the value of the accumulator.
	 * @return 
	 */
	public int getAccu(){
		return accu;
	}
	
	/**
	 * Reset the accumulator.
	 */
	public void resetAccu(){
		accu = ACCU_DEFAULT;
	}
	
	/**
	 * Reset the whole computer.
	 */
	public void resetComputer(){
		accu = ACCU_DEFAULT;
		operand_A = OPERAND_DEFAULT;
		operand_B = OPERAND_DEFAULT;
		operator = OPERATOR_DEFAULT;
		// memory = MEMORY_DEFAULT;	// storage-reset only by user!
		stat_opA = STATUS_OPERAND_DEFAULT;
	}
	
	/**
	 * Store the accumulator.
	 */
	public void saveToMemory(){
		memory = accu;
	}
	
	/**
	 * Clear the storage.
	 */
	public void clearMemory(){
		memory = MEMORY_DEFAULT;
	}
	
	/**
	 * Recall the stored value to accumulator.
	 */
	public void recallMemory(){
		accu = memory;
	}
}