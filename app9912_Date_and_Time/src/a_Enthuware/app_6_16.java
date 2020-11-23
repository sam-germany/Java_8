package a_Enthuware;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class app_6_16 {

	public static void main(String[] args) {

		LocalTime n1 = LocalTime.now();
		
		LocalTime n2 = LocalTime.of(1, 15);
		
		System.out.println(n1.isAfter(n2));
		
		System.out.println(n2.isAfter(n1));
		
		long s = n1.until(n2, ChronoUnit.HOURS);
		
		System.out.println(s);
		
	}

}
