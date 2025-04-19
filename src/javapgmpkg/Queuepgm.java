package javapgmpkg;

import java.util.LinkedList;
import java.util.Queue;

public class Queuepgm
{

	    public static void main(String[] args) {
	        Queue<String> car = new LinkedList<>();

	        car.add("Honda");
	        car.add("Maruti");
	        car.add("BMW");
	        car.add("Audi");

	        System.out.println("Initial Queue: " + car);

	        System.out.println("Head of Queue: " + car.peek());
	        System.out.println("Removed: " + car.poll());
	        System.out.println("Queue after removal: " + car);
	        
	        //iteration
	        System.out.println("Iteratiion");
	        for(String s:car)
	        {
	        	System.out.println(s);
	        }
	    }
}
	

