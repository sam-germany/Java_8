package b_Whizlab;

import java.time.Period;

public class app_5_81 {

	public static void main(String[] args) {

		Period p  = Period.ofDays(12).multipliedBy(3);
		
		System.out.println(p);
		
		System.out.println(p.negated());
		
	}

}
