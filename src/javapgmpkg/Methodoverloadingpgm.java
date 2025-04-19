package javapgmpkg;

public class Methodoverloadingpgm {
	public static void main(String[] args) 
	{
		Methodoverloadingpgm ob=new Methodoverloadingpgm();
		ob.add(10,20);
		ob.add(3.14,2);
		ob.add(1, 1.14);
		ob.add(10,20,30);
	}
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("value of c="+c);
	}
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println("value of c="+c);
	}
	public void add(double a,int b)
	{
		double c=a+b;
		System.out.println("value of c="+c);
	}
	public void add(int a,int b,int c)
	{
		int s=a+b+c;
		System.out.println("value of c="+s);
	}

}
