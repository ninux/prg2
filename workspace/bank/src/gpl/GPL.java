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

package gpl;

/**
 *
 * @author ninux
 */
public class GPL {
	
	static final private String COPYRIGHT = "PRG2 Copyright (C) 2014 "
		+ "Ervin Mazlagic";
	static final private String WARRANTY = "This program comes with "
		+ "ABSOLUTELY NO WARRANTY.";
	static final private String LICENSE = "This is free software. You can "
		+ "modify and redistribute it under certain conditions.";
	
	public GPL(){
		// standard Object constructor
	}
	
	static public String getCopyright(){
		return COPYRIGHT;
	}
	
	static public String getWarranty(){
		return WARRANTY;
	}
	
	static public String getLicense(){
		return LICENSE;
	}
	
	static public String getAllLicense(){
		String all = COPYRIGHT + "\n" 
			+ WARRANTY + "\n" 
			+ LICENSE;
		return all;
	}
	
	static public void printCopyright(){
		System.out.println(getCopyright());
	}
	
	static public void printWarranty(){
		System.out.println(getWarranty());
	}
	
	static public void printLicense(){
		System.out.println(getLicense());
	}
	
	static public void printAllLicense(){
		System.out.println(getCopyright());
		System.out.println(getWarranty());
		System.out.println(getLicense());
	}
}
