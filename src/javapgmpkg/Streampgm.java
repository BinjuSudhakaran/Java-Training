package javapgmpkg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streampgm
{
	public static void main(String[] args)
	{
		List<Integer> nums=Arrays.asList(5,9,1,6,7,3,8,2,4,0);
		
		//Stream<Integer> data=nums.stream();
		
		//data.forEach(n->System.out.println(n));
		
		//long count=data.count();
		//System.out.println(count);

		//Stream sortedData=data.sorted();
		//sortedData.forEach(n->System.out.println(n));
		
		//Stream<Integer> mappedData=data.map(n->n*2);
		//mappedData.forEach(n->System.out.println(n));
		
		//nums.stream().filter(n->n%2==1).map(n->n*2).sorted().forEach(n->System.out.println(n));
		
		//int result=nums.stream().map(n->n*2).reduce(0,(c,e)->c+e);
		//System.out.println(result);
		
		List<Integer> evenNumbers=nums.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		
	}

}
