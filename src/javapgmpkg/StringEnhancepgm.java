package javapgmpkg;

public class StringEnhancepgm {

	public static void main(String[] args) {
		String str=" Hello ";
		String str1="";
		
		System.out.println(str);
		
		System.out.println(str.strip());
		
		System.out.println(str.stripTrailing());
		
		System.out.println(str.stripLeading());
		
		System.out.println(str1.isBlank());

		System.out.println(str.repeat(5));
		
		System.out.println(str.lines().count());
	}

}
