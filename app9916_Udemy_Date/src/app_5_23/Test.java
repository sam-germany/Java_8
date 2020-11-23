package app_5_23;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {

	public static void main(String[] args) {

		System.out.println(LocalDateTime.parse("1987-09-01 25:25")
				      .format(DateTimeFormatter.ISO_DATE_TIME));
	    
	
	

	}

}
