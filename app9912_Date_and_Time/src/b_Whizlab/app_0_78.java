package b_Whizlab;

import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.Temporal;

public class app_0_78 {

	public static void main(String[] args) {

		LocalDate l = LocalDate.of(2015, 11, 25);
		
		Year y = Year.of(2014);
		
		
		
		System.out.println(l.adjustInto(y.atDay(1)));
		
	}

}
