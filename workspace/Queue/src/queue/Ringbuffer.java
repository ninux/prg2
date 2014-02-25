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

/**
 *
 * @author ninux
 */
public class Ringbuffer {
	
	private int size;
	private int elements = 0;
	private int in = 0;
	private int out = 0;
	private Object[] queue;
	
	public Ringbuffer(int bufferSize){
		size = bufferSize;
		queue = new Object[size];
	}
	
	public void enqueue(Object obj){
		if(elements < size){
			elements++;
			if(in == size){
				in = 0;
			}
			queue[in] = obj;
			in++;
		}
		else{
			
		}
	}
	
	public Object dequeue(){
		if(elements > 0){
			elements--;
			if(out == size){
				out = 0;
			}
			Object obj = queue[out];
			out++;
			return obj;
		}
		else{
			return null;
		}
	}
	
	public boolean isEmpty(){
		return (elements == 0);
	}
	
	public boolean isFull(){
		return (elements == size);
	}

}
