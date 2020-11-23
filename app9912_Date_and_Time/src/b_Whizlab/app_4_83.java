package b_Whizlab;

import java.time.Period;

public class app_4_83 {

	public static void main(String[] args) {

		Period p = Period.ofDays(2);
		
		p = p.multipliedBy(2);
		
		System.out.println(p.getDays());
		
		System.out.println(p.toTotalMonths());
	}

}
