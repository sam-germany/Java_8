package b_Whizlab;

import java.time.Instant;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class app_5_79 {

	public static void main(String[] args) {

		Instant i = Instant.now();
		
		i = i.plus(2, ChronoUnit.HOURS);
		
		System.out.println(i.getLong(ChronoField.NANO_OF_SECOND));
	}

}
