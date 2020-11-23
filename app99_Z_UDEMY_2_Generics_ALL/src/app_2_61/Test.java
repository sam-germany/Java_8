package app_2_61;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String>  e = Arrays.asList("dd@cc.com","cc@dd.de","xx@dd.com", "dd@cc.coa");
		
		Collections.sort(e, Comparator.comparing(x -> x.substring(x.indexOf("@")+ 1)));
 
		
		for(String str :e) {
			System.out.println(str);
		}
	
	}

}
/*Note:  the main point hier is as we define the   x.substring(); hier the  .comparing() method will compare
 the whole substring elements with one and another. 

 in example  app_2_53   with .comparteTo()  method we are comparing ony the first character of the String

 but hier with  Comparator.comparing()   method  it will compare the whole String  see the output

as  this "dd@cc.com"  we define first and   "dd@cc.coa"  we define last but it come in output in the begining

 

*/