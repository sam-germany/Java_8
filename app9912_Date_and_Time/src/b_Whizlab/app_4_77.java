package b_Whizlab;

import java.time.Period;
import java.time.temporal.ChronoUnit;

public class app_4_77 {

	public static void main(String[] args) {

		Period p = Period.of(2015, 03, 15);
		
		long l = p.get(ChronoUnit.MONTHS);
		
		System.out.println(l);
		
	}

}
