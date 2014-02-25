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
public class LinkedList {
	
	private ListNode head;
	
	public LinkedList(){
		head = null;
	}
	
	public void insert(Account a){
		if(!contains(a)){
			head = new ListNode(a, head);
		}
	}
	
	public void print(){
		ListNode actualNode = head;
		while(actualNode != null){
			actualNode.getAccount().print();
			actualNode = actualNode.getNext();
		}
	}
	
	public int getLength(){
		int length = 0;
		ListNode actualNode = head;
		while(actualNode != null){
			length++;
			actualNode.getNext();
		}
		return length;
	}
	
	public boolean contains(Account aAccount){
		ListNode actualNode = head;
		while((actualNode != null) && !aAccount.equals(actualNode.getAccount())){
			actualNode = actualNode.getNext();
		}
		if(actualNode == null){
			return false;
		}
		else{
			return true;
		}
	}
}
