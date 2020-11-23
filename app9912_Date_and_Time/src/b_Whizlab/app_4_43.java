package b_Whizlab;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class app_4_43 {

	public static void main(String[] args) {

		LocalDateTime date= LocalDateTime.of(2016,12,1,12,10);
		
		String ld = date.format(DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(ld);

		String lt = date.format(DateTimeFormatter.ISO_TIME);
		System.out.println(lt);
	}

}
