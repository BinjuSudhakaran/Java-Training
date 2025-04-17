package javapgmpkg;

public class Exceptionpgm 
{
	public static void checkAge(int age) throws Myexception
	{
	     if (age < 18) 
	     {
	         throw new Myexception("Age must be 18 or above.");
	     }
	     else 
	     {
	         System.out.println("Access granted.");
	     }
	 }
	public static void main(String[] args)
	{
	     try {
	         checkAge(16);
	     	} 
	     catch (Myexception e) {
	         System.out.println("Caught Exception: " + e.getMessage());
	     }
	 }

}
class Myexception extends Exception
{
	public Myexception(String message)
	{
		super(message);
	}
}




 
