package b_Whizlab;

import java.time.Period;

public class app_2_83 {

	public static void main(String[] args) {

		Period p = Period.ofMonths(13);
		
		System.out.println(p);
		
		System.out.println(p.normalized());
	}

}
