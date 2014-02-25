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

/**
 *
 * @author ninux
 */
public class Main{
	static public void main(String[] args){
		
		// show licsnse info
		printAllLicense();
		System.out.println();
		
		// create an desposit account
		Deposit d1 = new Deposit(123.50, 1.25, 1000.00);
		
		// show desposit status
		d1.print();
		
		// create an bank
		Bank b1 = new Bank("First Bank of HSLU");
		b1.openAccount(100.25, 0.25);
		b1.openDeposit(2541.80, 1.25, 1000);
		System.out.println("\nAll Accounts from " + b1.getName() + "\n");
		b1.printAccounts();
			
		// create a linked list
		LinkedList myList = new LinkedList();
		
		// insert some accounts into the linked list
		Account a1 = new Account(100, 1.0);
		Account a2 = new Account(200, 2.0);
		Account a3 = new Account(300, 3.0);
		Account a4 = new Account(400, 4.0);
		
		myList.insert(a1);
		myList.insert(a2);
		myList.insert(a3);
		myList.insert(a4);

		// show the content of the linked list
		myList.print();
			
	}
}