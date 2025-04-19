package javapgmpkg;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayQueuepgm {

	public static void main(String[] args) 
	{
				Queue<String> fruits=new ArrayDeque<>();
				fruits.add("apple");
				fruits.add("banana");
				fruits.add("orange");
				fruits.add("avocado");
				fruits.add("");
				System.out.println(fruits);
				System.out.println(fruits.size());
				//System.out.println(fruits.peek());
				//System.out.println(fruits.poll());
				//System.out.println(fruits.remove());
		}

}

	