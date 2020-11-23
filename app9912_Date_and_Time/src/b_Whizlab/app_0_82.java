package b_Whizlab;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class app_0_82 {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.of(2010, 1, 2);
		Period due  = Period.ofDays(-2).plusMonths(1);
		ld = ld.plus(due);
		
		System.out.println(ld);

		System.out.println("-------------------");
		
		LocalDate d= LocalDate.of(2017, Month.MARCH, 25);
		Period p = Period.ofDays(-2).ofMonths(1);
		d = d.plus(p);
		
		System.out.println(d);
		
		
	}

}
