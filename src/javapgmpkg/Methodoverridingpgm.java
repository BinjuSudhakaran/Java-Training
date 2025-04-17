package javapgmpkg;

public class Methodoverridingpgm {
	public static void main(String[] args)
	{
		Baleno ba=new Baleno();
		ba.engine();

	}
}

	class Maruti
	{
		public void engine()
		{
			System.out.println("Maruti engine speed");
		}
	}
	class Baleno extends Maruti
	{

		@Override
		public void engine() 
		{
			System.out.println("Baleno engine speed");
			super.engine();
		}
		
	}

	