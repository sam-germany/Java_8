package b_Whizlab;

import java.time.LocalDate;

public class app_4_72 {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.of(2010, 10, 10);
		
		int days = ld.lengthOfMonth();
		
		System.out.println(days); // it wil not print 10-- it prints the length of October month is 31 
		                          // so it prints  31
	}

}
