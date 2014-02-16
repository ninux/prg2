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

package GPL;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import static gpl.GPL.*;

/**
 *
 * @author ninux
 */
public class test {
	
	public test() {
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
	public void testCopyright(){
		String want = "PRG2 Copyright (C) 2014 "
			+ "Ervin Mazlagic";
		String is = getCopyright();
		assertEquals(want, is);
	}
	
	@Test
	public void testWarranty(){
		String want = "This program comes with "
		+ "ABSOLUTELY NO WARRANTY.";
		String is = getWarranty();
		assertEquals(want, is);
	}

	@Test
	public void testLicense(){
		String want = "This is free software. You can modify and "
			+ "redistribute it under certain conditions.";
		String is = getLicense();
		assertEquals(want, is);
	}
	
}
