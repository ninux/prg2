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

package ilist;
import static gpl.GPL.*;

/**
 *
 * @author ninux
 */
public interface IList {

	/**
	 * Adds an Integer-Object to the list.
	 * @param a object to be added to the list
	 */
	void add(Integer a);
	
	/**
	 * Temoves an Integer-Object a from the list.
	 * @param a object to be remove from the list
	 * @return true if removement was successful
	 */
	boolean remove(Integer a);
	
	/**
	 * Removes one Integer-Object with the integer value a.
	 * @param a value to specifiy the object that will be removed
	 * @return true if removement was successful.
	 */
	boolean removeValue(int a);
	
	/**
	 * Removes all Integer-Objects with the integer value a.
	 * @param a value to specify the objects that will be removed
	 * @return true if removement was successful
	 */
	boolean removeValues(int a);
	
	/**
	 * Returns the number of elements in the list.
	 * @return number of elements in the list
	 */
	int size();
	
	/**
	 * Checks if the integer value a is in the list.
	 * @return true if the list has an element with the integer value a
	 */
	boolean exists(int a);
	
	/**
	 * Print all elements of the list.
	 */
	void print();
	
}
