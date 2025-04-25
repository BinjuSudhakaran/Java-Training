package javapgmpkg;

import java.util.Optional;

public class OptionalPgm02 {

	public static void main(String[] args) {
		
		Optional<String> cake=Optional.ofNullable(getCakeFromFridge());
		cake.ifPresent(n->System.out.println(n));
		
		String noCake=cake.orElse("no cake left");
		System.out.println(noCake);
	}

	private static String getCakeFromFridge() {
		// TODO Auto-generated method stub
		return "wawoo cake is here";
	}

}
