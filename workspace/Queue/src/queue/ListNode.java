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

/**
 *
 * @author ninux
 */
public class ListNode {
	
	private ListNode previous;
	private ListNode next;
	private Object data;
	
	public ListNode(Object obj){
		previous = null;
		next = null;
		data = obj;
	}
	
	public ListNode(ListNode before, ListNode after, Object obj){
		previous = before;
		next = after;
		data = obj;
	}
	
	public void setNext(ListNode n){
		next = n;
	}
	
	public void setPrevious(ListNode p){
		previous = p;
	}
	
	public void setData(Object d){
		data = d;
	}
	
	public ListNode getNext(){
		return next;
	}
	
	public ListNode getPrevious(){
		return previous;
	}
	
	public Object getData(){
		return data;
	}
	
}
