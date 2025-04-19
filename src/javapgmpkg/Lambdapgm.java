package javapgmpkg;
@FunctionalInterface
interface Sample
{
	void Show();
}
public class Lambdapgm {

	public static void main(String[] args) 
	{
		Sample obj=()->System.out.println("Lambda sample");
		obj.Show();
	
	}

}
