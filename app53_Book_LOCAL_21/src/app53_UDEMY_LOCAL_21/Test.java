package app53_UDEMY_LOCAL_21;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

public class Test{

	public static void main(String[] args) {

		Locale.setDefault(Locale.KOREAN);
		System.out.println(Locale.getDefault());
		
		Locale.setDefault(new Locale("en","AU"));
		System.out.println(Locale.getDefault());
		
		Locale.setDefault(new Locale("EN"));
		System.out.println(Locale.getDefault());
		
		
		
	}

}
