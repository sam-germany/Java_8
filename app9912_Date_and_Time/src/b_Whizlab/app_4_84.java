package b_Whizlab;

import java.time.Period;

public class app_4_84 {

	public static void main(String[] args) {

		Period p1 = Period.ofYears(1);
		
		Period p2 = Period.of(0, 1, 0);
		
		Period p3 = p1.plus(p2);
		
		System.out.println(p3.getYears());
		System.out.println(p3.getMonths());
		System.out.println(p3.getDays());
	}

}
