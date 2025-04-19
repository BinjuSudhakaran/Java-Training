package javapgmpkg;
@FunctionalInterface
interface Fruit
{
	void mango();
}
public class Lamdapgm1 {
	public static void main(String args[])
	{
		Fruit obj=()->
		{
			System.out.println("Mango is sweet");
			System.out.println("Mango is juicy");
			System.out.println("Mango is tasty");
		};
		obj.mango();
	}
	
}
