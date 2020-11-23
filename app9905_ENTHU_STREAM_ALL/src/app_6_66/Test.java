package app_6_66;

import java.util.Optional;

public class Test {

	public static String getValue1() {
		return "aa";
	}
	
	
	public static void main(String[] args) {

		
		Optional<String> stro = Optional.ofNullable(getValue1());
		
		System.out.println(stro);
		
		System.out.println(stro.isPresent());
		System.out.println(stro.get());
		System.out.println(stro.orElse(null));
		
		
	}

}
