package b_Whizlab;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;

public class app_1_81 {

	public static void main(String[] args) {

		Year y= Year.of(2000);
		
		LocalDate ym  = y.atMonthDay(MonthDay.of(11, 22));
		
		System.out.println(ym);
	}

}
