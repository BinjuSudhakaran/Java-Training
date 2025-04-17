package javapgmpkg;

public class Encapsulationpgm {
	public static void main(String args[])
	{
		Person ob=new Person();
		ob.setName("Anu");
		System.out.println(ob.getName());
		ob.setAge(10);
		System.out.println(ob.getAge());
		ob.getAge();
	}
	

}
class Person
{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}

