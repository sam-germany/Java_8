package app_5_15;

import java.time.LocalDate;
import java.time.Period;

public class Test {

	public static void main(String[] args) {
		
		  LocalDate d3 = LocalDate.parse("1999-09-9");
	        LocalDate d4 = LocalDate.of(1999, 9, 9);
	        
	        System.out.println(d3.equals(d4));
	    }
	}