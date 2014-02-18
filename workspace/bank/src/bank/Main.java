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
		
		
		
	}
}
