/*
 * This is a part of the "PRG2" source from the github repository prg2
 * which is available at http://github.com/ninux/prg2
 *
 * Copyright (C) 2014, Ervin Mazlagic (aka. ninux, Nino Ninux)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package bank;

/**
 *
 * @author ninux
 */
public class Account {
	// counter for created accounts
	private static int count = 0;
	
	// account number, saldo and rate
	private int no = 0;
	private double saldo = 0;
	private double rate = 0;
	
	// account constructor
	public Account(){
		count++;		// no account with number 0
		no = count;
		saldo = 0;
		rate = 0;
	}
	
	// parametrized account constructor
	public Account(double aSaldo, double aRate){
		count++;
		no = count;
		saldo = aSaldo;
		rate = aRate;
	}
	
	public void payIn(double aPayIn){
		saldo = saldo + aPayIn;
	}
	
	public void payOut(double aPayOut){
		saldo = saldo - aPayOut;
	}
	
	public void print(){
		System.out.println("Account Number: \t\t" + no);
		System.out.println("Account Saldo: \t\t\t" + saldo);
		System.out.println("Account Rate: \t\t\t" + rate);
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	
}
