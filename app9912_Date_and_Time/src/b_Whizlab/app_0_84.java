package b_Whizlab;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class app_0_84 {

	public static void main(String[] args) {

		Instant now = Instant.now();
		System.out.println(now);
		
		
		ZonedDateTime  zid = ZonedDateTime.ofInstant(now, ZoneId.of("Canada/Atlantic"));
		System.out.println(zid.getHour());
	}

}
