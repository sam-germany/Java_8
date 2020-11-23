package b_Whizlab;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class app_0_83 {

	public static void main(String[] args) {

		Instant now = Instant.now();
        System.out.println(now);
		
        Instant now1 = now.truncatedTo(ChronoUnit.HOURS);
		System.out.println(now1);
        
        
		now = now.truncatedTo(ChronoUnit.DAYS);
		System.out.println(now);
	}

}
