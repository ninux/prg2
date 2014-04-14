
package addressbook;

import external.*;

public class AddressBook {

	public static void main(String[] args) {
		System.out.println("Hi there!");
		
		AddressEntry ae = new AddressEntry();
		
		try{
			ae.setGivenName("Lol7789ta");
		}
		catch (IllegalArgumentException e){
			System.out.println("Your argument is invalid: " + e.getMessage());
		}
		finally{
			System.out.println(ae.getGivenName());
		}
		
		
	}
	
}
