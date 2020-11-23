package b_Whizlab;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class app_4_80 {

	public static void main(String[] args) {

		LocalDate ldt= LocalDate.of(2015,10,10);
		System.out.println(ldt);
		
	    LocalDateTime  x = ldt.atStartOfDay();
		
	    System.out.println(x);
	    
		
		
	}

}
