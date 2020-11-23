package app_6_65;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test {

	public static void main(String[] args) {

		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		
		LocalDateTime ldt = LocalDateTime.of(2015, 10,10,11,22);
		System.out.println(ldt.format(dtf));

		LocalDate ld = LocalDate.of(2000, 02, 12);
		System.out.println(ld.format(dtf));
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("mm/hh");
		
		LocalTime lt = LocalTime.of(07, 55);
		System.out.println(lt.format(dtf2));
		
		
		System.out.println(LocalTime.now());
		
		
		
		
	}

}
