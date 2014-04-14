
package addressbook;

import external.*;

public class MyBook {

	public static void main(String[] args) {
		System.out.println("Hi there!");
		
		try{
			AddressEntry ae = new AddressEntry(
					"Ninux", 
					"Nino", 
					"6000", 
					"Lucerne", 
					"123456789", 
					"nino.ninux@gmail.com");
		}
		catch (IllegalArgumentException e){
			System.out.println("Your argument is invalid: " + e.getMessage());
		}
		
	}
	
}
