package app55_Book_30;

import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		
	     Locale loc = new Locale("it", "IT");
	        System.out.println(loc.getDisplayCountry()); //Line 8
	        System.out.println(loc.getDisplayCountry(Locale.CHINA)); //Line 9
	        System.out.println(loc.getDisplayLanguage()); //Line 10
	        System.out.println(loc.getDisplayLanguage(Locale.CHINA)); //Line 11
	    }
	}