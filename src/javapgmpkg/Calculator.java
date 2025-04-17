package javapgmpkg;
import java.util.Scanner;

public class Calculator 
{

	public static void main(String[] args) 
	{
		int c;
		do
		{
		System.out.println("1- Addition");
		System.out.println("2- Sutraction");
		System.out.println("3- Multiplication");
		System.out.println("4- Division");
		System.out.println("Enter your choice");
		Scanner sc = new Scanner(System.in);
			c=sc.nextInt();
			System.out.println("Enter two numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			switch(c)
			{
			case 1:
				int s=a+b;
				System.out.println("Sum="+s);
				break;
			case 2:
				int d=a-b;
				System.out.println("Difference="+d);
				break;
			case 3:
				int p=a*b;
				System.out.println("Product="+p);
				break;
			case 4:
				int q=a/b;
				System.out.println("Quotient="+q);
				break;
				
			default:
				System.out.println("Invalid Choice");
				break;
			
			}
		
		}while(c<4);
	
	}

}
