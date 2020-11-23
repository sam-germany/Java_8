package app_04;

import java.util.Date;
import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {

		Supplier<Date> s = Date::new;
		
		Date d = s.get();
		System.out.println(d);
	
	
		
         Supplier<Date> s2 = () -> new Date();
		
		Date d2 = s2.get();
		System.out.println(d2);
	
	
	
	
	}

}
