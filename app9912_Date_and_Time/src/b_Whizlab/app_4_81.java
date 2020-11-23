package b_Whizlab;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class app_4_81 {

	public static void main(String[] args) {

		LocalTime lt = LocalTime.of(22, 10);
		System.out.println(lt);

	    lt = lt.truncatedTo(ChronoUnit.HALF_DAYS);
	    System.out.println(lt);
	
	    System.out.println("-----------");
	    
	    LocalTime lt2 = LocalTime.of(10, 10);
		System.out.println(lt2);

	    lt2 = lt2.truncatedTo(ChronoUnit.HALF_DAYS);
	    System.out.println(lt2);
	    
	
	
	}

}
