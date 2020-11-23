package b_Whizlab;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class app_2_78 {

	public static void main(String[] args) {

		
		LocalDate id = LocalDate.of(2015, 12, 12);
		
		id= id.with(ChronoField.DAY_OF_YEAR,30);
		System.out.println(id);
		
		
		
		id= id.with(ChronoField.DAY_OF_YEAR,56);
		System.out.println(id);
		
	}

}
