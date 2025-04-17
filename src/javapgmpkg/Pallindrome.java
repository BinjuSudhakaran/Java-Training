package javapgmpkg;

import java.util.Scanner;

public class Pallindrome {
	public static void main(String args[])
	{
		int temp,n,r,sum=0;
		System.out.println("Enter a Number:");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		temp=n;    
		while(n>0)
		{    
			r=n%10; 
			sum=(sum*10)+r;    
			n=n/10;    
	    }    
		  if(temp==sum)    
		   System.out.println("palindrome number ");    
		  else    
		   System.out.println("not palindrome");    
	}

}
