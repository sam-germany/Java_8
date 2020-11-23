package whizlabs;

import java.util.Locale;

public class app_1_72 {

	public static void main(String[] args) {

		Locale loc = new Locale.Builder().setLanguage("en").build();
		
		System.out.println(loc.getDisplayLanguage(new Locale("En"))+"---");
	
	   System.out.println(loc.getDisplayCountry(new Locale("EN"))+"===");
	}

}
