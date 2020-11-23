package b_Whizlab;

import java.time.LocalDate;

public class app_4_78 {

	public static void main(String[] args) {

		LocalDate d  = LocalDate.of(2015, 10, 15);
		System.out.println(d);
		
		
		LocalDate x= d.withDayOfMonth(7);
		
		System.out.println(x);
	}

}
