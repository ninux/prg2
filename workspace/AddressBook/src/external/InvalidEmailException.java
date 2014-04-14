package external;

public class InvalidEmailException extends IllegalArgumentException
{
    public InvalidEmailException(String s) 
    {
        super("my Exception" + s);
    }   
}
