package javapgmpkg;

import java.util.Optional;

public class Optionalpgm03 {

	    public static void main(String[] args) {
	        String userName = getUserName(); 
	        
	         Optional<String> name = Optional.ofNullable(userName);
	         
	      
	         //Optional<String> upperCase=name.map(String::toUpperCase);
	         
	         Optional<String> upperCase=name.map(n->n.toUpperCase());
	         System.out.println(upperCase);
	         
	         Optional <String> name1=Optional.ofNullable(getName());
	         
	         
	         name1.ifPresent(n->System.out.println("Hello"+n));
	         
	         
	       	 name.ifPresent(n -> System.out.println("Hello, " + n));
	       	 
	        String displayName = name.orElse("Guest");
	        
	        System.out.println("Welcome, " + displayName);
	    }

	    private static String getName() {
			// TODO Auto-generated method stub
			return "Alice";
		}

		public static String getUserName() 
	    {
	        return null;  //Alice;
	    }
	}


