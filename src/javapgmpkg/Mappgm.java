package javapgmpkg;

import java.util.HashMap;
import java.util.Map;

public class Mappgm 
{
	    public static void main(String[] args) {
	     
	        //Map<Integer, String> map = new HashMap<>();
	        Map<Integer,String> fruit=new HashMap<>();
	        fruit.put(1, "apple");
	        fruit.put(2, "banana");
	        fruit.put(3, "mango");
	        fruit.put(2, "grapes");
	        System.out.println("Value at key 2: " +fruit.get(2));

	      	for (Map.Entry<Integer, String> entry : fruit.entrySet())
	      	{
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }

	   /*     // Checking for a key
	        if (fruit.containsKey(3)) {
	            System.out.println("Key 3 exists in the map.");
	        }

	        // Removing a key
	        fruit.remove(1);

	        System.out.println("Updated Map: " + fruit);*/
	    }
	}

