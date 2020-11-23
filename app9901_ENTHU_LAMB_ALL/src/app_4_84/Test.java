package app_4_84;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Supplier;

public class Test {

	public static void main(String[] args) {

		String  name1 = "bunny";
		String  val = null;
		
		Supplier<String>  s = name1::toUpperCase;
		
         val = s.get();
         
         System.out.println(val);
		
		
		
         
         Function<Locale, String> f1 = name1::toUpperCase;   // not understand exactelly why he uses like this.
         
         val= f1.apply(Locale.UK);
         
         System.out.println(val);
         
         
         
	}

}
