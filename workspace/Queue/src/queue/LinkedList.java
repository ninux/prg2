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

package queue;
import static gpl.GPL.*;
import queue.ListNode;

/**
 *
 * @author ninux
 */
public class LinkedList {
	
	ListNode head;
	ListNode tail;
	ListNode current;
	
	public LinkedList(){
		head = null;
		tail = null;
		current = null;
	}
	
	public void insertAtBegin(Object obj){
		if(head == null){
			ListNode newNode = new ListNode(obj);
			newNode.setPrevious(null);
			newNode.setNext(null);
			head = newNode;
		}
		else{
			ListNode newNode = new ListNode(obj);
			newNode.setNext(head);
			newNode.setPrevious(null);
			head.setPrevious(newNode);
			head = newNode;
		}
	}
}
