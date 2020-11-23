package b_Whizlab;

import java.time.Year;

public class app_0_80 {

	public static void main(String[] args) {

		Year y1 = Year.of(2014);

		System.out.println(y1);
		
		
		Year y2 = y1.now();
		
		System.out.println(y2);
	}

}
