package javapgmpkg;
@FunctionalInterface
interface Sum
{
	//void add(int a,int b);
	int add(int a,int b);
}
public class Lamdapgm2 {

	public static void main(String[] args) {
		//Sum obj=(a,b)->System.out.println(a+b);
		//obj.add(5, 5);
		Sum obj=(a,b)->a+b;
		System.out.println(obj.add(12,13));
	}

}
