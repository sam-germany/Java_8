package whiz_5_56;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();
	    l.add("Livera");
	    l.add("Sanka");
	    l.add("Aharma");
	    l.add("ss");
	
	    
	    Collections.sort(l , String.CASE_INSENSITIVE_ORDER.reversed());
	    
	    
	    System.out.println(l);

	 // like we have to use  Collections.sort( list, Comparator)  but if we use like this
	 // then we do not need to use  Comparator
	// as i checked for int type but not like this type i found that we put in the .sort()
	// method.
	
	    
	
	}

}
