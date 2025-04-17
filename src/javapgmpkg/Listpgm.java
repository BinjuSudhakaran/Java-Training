package javapgmpkg;

import java.util.ArrayList;
import java.util.List;

public class Listpgm {
	public static void main(String args[])
	{
	List<String> fruits=new ArrayList<>();
	fruits.add("Apple");
	fruits.add("Orange");
	fruits.add("Apple");
	//System.out.println(fruits);
	for(String fruit:fruits)
	{
		System.out.println(fruit);
	}
	}

}
