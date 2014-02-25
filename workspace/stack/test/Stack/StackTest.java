/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Stack;
import stack.Stack;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ninux
 */
public class StackTest {
	
	public StackTest() {
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
	public void pushToStack(){
		Stack s = new Stack();
		assertEquals(s.isEmpty(), true);
		s.push("Hello");
		assertEquals(s.isEmpty(), false);
	}
	
	@Test
	public void popFromStack(){
		Stack s = new Stack();
		
		String a = "AAA";
		String b = "BBB";
		String c = "CCC";
		
		assertEquals(s.isEmpty(), true);
		
		s.push(a);
		s.push(b);
		s.push(c);
		
		assertEquals(s.isEmpty(), false);
		
		assertEquals(s.pop(), c);
		assertEquals(s.pop(), b);
		assertEquals(s.pop(), a);
		
		assertEquals(s.isEmpty(), true);
	}
    
}
