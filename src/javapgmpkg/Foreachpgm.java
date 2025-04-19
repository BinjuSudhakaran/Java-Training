package javapgmpkg;

import java.util.Arrays;
import java.util.List;

public class Foreachpgm {

	public static void main(String[] args) {
	List<Integer> nums=Arrays.asList(1,2,3,4,5);
	
	nums.forEach(n->System.out.println(n));

	}

}
