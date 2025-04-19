package javapgmpkg;
import java.util.HashSet;
import java.util.Set;
public class Setpgm 
{
	public static void main(String[] args)
	{
		Set<String> fruits = new HashSet<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Apple"); 
		System.out.println("Fruits in the set: " + fruits);
		if (fruits.contains("Banana")) 
		{
			System.out.println("Banana is in the set.");
	    }
	  /*  fruits.remove("Orange");
        System.out.println("Updated set after removing Orange: " + fruits);*/
	    System.out.println("Iterating through the set:");
	    for (String fruit : fruits) 
	    {
	            System.out.println(fruit);
	    }
	    System.out.println("Total number of unique fruits: " + fruits.size());
	 }
}



