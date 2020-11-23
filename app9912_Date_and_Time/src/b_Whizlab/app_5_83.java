package b_Whizlab;

import java.time.LocalTime;

public class app_5_83 {

	public static void main(String[] args) {

		LocalTime lt1 = LocalTime.of(12, 30);
		LocalTime lt2 = LocalTime.of(12, 59);
		
		System.out.println(lt1.isAfter(lt2));
		
		
		
		
	}

}
