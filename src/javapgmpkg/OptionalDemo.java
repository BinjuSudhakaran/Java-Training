package javapgmpkg;

import java.util.Optional;

import javax.swing.Spring;

public class OptionalDemo 
{
	public static void main(String args[])
	{
		Optional<String> emptyOptional=Optional.empty();
		Optional<String>nonEmptyOptional=Optional.of("Hello");
		System.out.println("Empty Optional is:"+emptyOptional);
		System.out.println(" Non Empty Optional is:"+nonEmptyOptional);
		
	}
}
