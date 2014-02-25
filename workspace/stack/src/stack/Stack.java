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
import java.util.ArrayList;

/**
 *
 * @author ninux
 */
public class Stack {

	// stack implemented by an ArrayList 
	private ArrayList stack = new ArrayList();
	
	public Stack(){
		
	}
	
	// push a new object to the stack
	public void push(Object o){
		stack.add(o);
	}
	
	// pop an object from the stack
	public Object pop(){
		// stackpointer is above last entry! return SP-1
		return stack.remove(stack.size()-1);
	}
	
	public boolean isEmpty(){
		return stack.isEmpty();
	}
	
	public boolean isFull(){
		// can't be true since using an ArrayList
		return false;
	}
	
}
