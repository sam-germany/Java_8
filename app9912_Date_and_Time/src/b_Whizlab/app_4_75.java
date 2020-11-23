package b_Whizlab;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class app_4_75 {

	public static void main(String[] args) {

		Duration due = Duration.of(1, ChronoUnit.HALF_DAYS);
		System.out.println(due);
		
		due = due.plus(60, ChronoUnit.MINUTES);
		System.out.println(due);
		
		System.out.println(due.minus(due));
		
	}

}
