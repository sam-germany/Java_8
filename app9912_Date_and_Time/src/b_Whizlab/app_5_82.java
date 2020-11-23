package b_Whizlab;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class app_5_82 {

	public static void main(String[] args) {

		Duration due = Duration.ofDays(-4);
		
		
		LocalDate ld = LocalDate.of(2015, 7, 8);
		
		System.out.println(ld.plus(due.toDays(), ChronoUnit.DAYS));
	}

}
