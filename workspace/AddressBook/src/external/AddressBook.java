package external;

import java.util.ArrayList;

public class AddressBook
{
    ArrayList<AddressEntry> list;
    public AddressBook()
    { 
        list = new ArrayList<AddressEntry>();
    }

    public void tester() throws Exception
    {
        AddressEntry a = new AddressEntry();

        try {
			a.setGivenName("Hans");
			a.setFamilyName("Muster");
			a.setZipCode("6048");
			a.setResidence("Horw");
			a.setPhoneNumber("+41413391111");
			a.setEmailAddress("Hans.Muster@info.com");
        }
		catch (InvalidEmailException e){
			throw new InvalidEmailException("invalid number of @ character");
		}
        catch (IllegalArgumentException e) {
			throw new IllegalAccessException();
		}

        list.add(a);
    }
}
