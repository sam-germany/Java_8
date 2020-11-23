package b;

import java.time.Period;

public class T{



   
	public static void main(String [] args1) {
	  
		Period p1 = Period.ofYears(1);
		Period p2 = Period.of(0, 1, 0);
		
		Period p3  =p1.plus(p2);
		System.out.println(p3);
    
    
    }
}