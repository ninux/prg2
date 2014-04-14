package external;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressEntry
{
    private String givenName, familyName;
    private String zipCode;
    private String residence;
    private String phoneNumber;
    private String eMailAddress;

    public AddressEntry()
    {

    }

    public AddressEntry(String givenName, String familyName, 
                        String zipCode, String residence, 
                        String phoneNumber, String eMailAddress)
    {
		setGivenName(givenName);
		setFamilyName(familyName);
		setZipCode(zipCode);
		setResidence(residence);
		setPhoneNumber(phoneNumber);
		setEmailAddress(eMailAddress);
    }

    public void setGivenName(String givenName) throws IllegalArgumentException
    {
		if(givenName == null){
			throw new IllegalArgumentException(givenName + " is null");
		}
		if(containsNumbers(givenName)){
			throw new IllegalArgumentException(givenName + " contains numbers");
		}
		if(givenName.length() > 20){
			throw new IllegalArgumentException(givenName + " has more than "
					+ "20 characters");
		}
		else{
			this.givenName = givenName;
		}
    }
	
	public String getGivenName(){
		return givenName;
	}

    public void setFamilyName(String familyName) throws IllegalArgumentException
    {
		if(familyName == null){
			throw new IllegalArgumentException(familyName + " is null");
		}
		this.familyName = familyName;
    }

    public void setZipCode(String zipCode) throws IllegalArgumentException
    {
		if(containsCharacters(zipCode)){
			throw new IllegalArgumentException(zipCode + " is not a swiss "
					+ "zip code");
		}
		if(zipCode.length() > 4){
			throw new IllegalArgumentException(zipCode + " is not a swiss"
					+ "zip code");
		}
		else{
			this.zipCode = zipCode;
		}
        
    }

    public void setResidence(String residence)
    {

    }

    public void setPhoneNumber(String phoneNumber)
    {

    }

    public void setEmailAddress(String eMailAddress) throws InvalidEmailException
    {
		if(!containsOneAt(eMailAddress)){
			throw new InvalidEmailException(eMailAddress + " is not valid");
		}
		else{
			this.eMailAddress = eMailAddress;
		}
    }
	
	private boolean containsNumbers(String s) {
		Pattern p = Pattern.compile(".*\\d.*");
		// Pattern for the numbers 0..9
		return p.matcher(s).find();
	}
	
	private boolean containsCharacters(String s){
		Pattern p = Pattern.compile("[a-zA-Z]");
		return p.matcher(s).find();
	}
	
	private boolean containsOneAt(String s){
		int counter = 0;
		Pattern p = Pattern.compile("[@]");
		Matcher m = p.matcher(s);
		while(m.find()){
			counter++;
		}
		return counter == 1;
	}
}