package b_Whizlab;

import java.time.Duration;

public class app_3_79 {

	public static void main(String[] args) {

		Duration due = Duration.ofDays(-2);
		
		System.out.println(due);
		
		due.abs();
		
		System.out.println(due);
		
		
		
		Duration d2 = due.abs();
		System.out.println(d2);


	}

}
