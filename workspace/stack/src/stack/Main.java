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

package stack;
import static gpl.GPL.*;

/**
 *
 * @author ninux
 */
public class Main {
	
	public static void main(String[] args){
		
		// show licsnse info
		printAllLicense();
		System.out.println();
		
		// create stack
		Stack s = new Stack();
		
		// push some things on the stack
		s.push("backwards!\n");
		s.push("is ");
		s.push("this ");
		s.push("Hello, ");
		
		while(!s.isEmpty()){
			System.out.print(s.pop());
		}
		
	}
	
}
