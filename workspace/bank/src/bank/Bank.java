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
import static gpl.GPL.*;
import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author ninux
 */
public class Bank {
	
	// name of the bank
	private String name = "DEFAULT";
	
	// list of registered accounts
	ArrayList<Account> alK = new ArrayList<Account>();
	
	// constructor of the bank
	public Bank(String aName){
		name = aName;
	}
	
	public String getName(){
		return name;
	}
	
	public void openAccount(double aSaldo, double aRate){
		alK.add(new Account(aSaldo, aRate));
	}
	
	public void openDeposit(double sSaldo, double aRate, double aMaxOut){
		alK.add(new Deposit(sSaldo, aRate, aMaxOut));
	}
	
	public int getNumberOfAccounts(){
		ListIterator<Account> itr = alK.listIterator();
		int number = 0;
		while(itr.hasNext()){
			number = number++;
			itr.next();
		}
		return number;
	}
	
	public void printAccounts(){
		ListIterator<Account> itr = alK.listIterator();
		while(itr.hasNext()){
			itr.next().print();
		}
	}
	
	private double getFound(){
		ListIterator<Account> itr = alK.listIterator();
		double liquid = 0;
		while(itr.hasNext()){
			liquid = liquid + itr.next().getSaldo();
		}
		return liquid;
	}
	
	public void printFound(){
		System.out.println(getFound());
	}
	
	
}