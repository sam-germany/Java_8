package b_Whizlab;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class app_3_84 {

	public static void main(String[] args) {

		String date= "1994-2-28 11:22";
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-M-d H:m");
		
		LocalDateTime ldt = LocalDateTime.parse(date, format);
		
		System.out.println(ldt);
	}

}
