package javapgmpkg;

public class Abstrctpgm 
{
	public static void main(String args[])
	{
		Dog ob1=new Dog();
		Cat ob2=new Cat();
		ob1.makeSound();
		ob2.makeSound();
		ob1.food();
		ob2.food();
	}
}
abstract class Animal
{
	abstract void makeSound();
	public void food()
	{
		System.out.println("Animal Food");
	}
}
class Dog extends Animal
{

	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Barking");	}
	
}
class  Cat extends Animal
{

	@Override
	void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Meows");
	}
	
}