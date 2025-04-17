package javapgmpkg;

public class Interfacepgm {
	public static void main(String[] args)
	{
		Car carob=new Car();
		Bike bikeob=new Bike();
		carob.start();
		bikeob.start();
	}

}
interface Vehicle
{
	void start();
	
}
class Car implements Vehicle
{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Car started");
	}
	
}
class Bike implements Vehicle
{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Bike started");
	}
	
}