package javapgmpkg;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuepgm {

	public static void main(String[] args)
	{
		Queue<String> fruits=new PriorityQueue<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("avocado");
		fruits.add("");
		System.out.println(fruits);//display in sorted order
		System.out.println(fruits.size());
	}

}
