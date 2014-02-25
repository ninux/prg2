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

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import queue.Ringbuffer;

/**
 *
 * @author ninux
 */
public class RingbufferTest {
	
	public RingbufferTest() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@AfterClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
	}
	
	@Test
	public void createRingbuffer(){
		Ringbuffer rb = new Ringbuffer(5);
	}
	
	@Test
	public void fillRingbuffer(){
		Ringbuffer rb = new Ringbuffer(4);
		
		String[] data = new String[]{"A", "B", "C", "D"};
		
		for(String s : data){
			rb.enqueue(s);
		}
		
		// positive test
		assertEquals(data[0], rb.dequeue());
		assertEquals(data[1], rb.dequeue());
		assertEquals(data[2], rb.dequeue());
		assertEquals(data[3], rb.dequeue());
		
		// negative test
		assertEquals(null, rb.dequeue());
		
		for(String s : data){
			rb.enqueue(s);
		}
		
		// test on overflow and overriding
		String[] overflow = new String[]{"WW", "XX", "YY", "ZZ"};
		
		for(String s : overflow){
			rb.enqueue(s);
		}
		
		// positive test
		assertEquals(data[0], rb.dequeue());
		assertEquals(data[1], rb.dequeue());
		assertEquals(data[2], rb.dequeue());
		assertEquals(data[3], rb.dequeue());
		
		// negative test
		assertEquals(null, rb.dequeue());
		
	}

	
	
}
