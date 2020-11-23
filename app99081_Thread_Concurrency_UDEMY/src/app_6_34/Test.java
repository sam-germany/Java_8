package app_6_34;

import java.util.Arrays;
import java.util.List;

public class Test {

	private static StringBuilder s1 = new StringBuilder();  
	
	
	public static void main(String[] args) {

		List<String> l = Arrays.asList(" A"," B"," C"," D"," E"," F"," G");
	
		
		l.parallelStream().forEach(s1::append);     // point:   as we use  static StringBuilder
		                                             // if we do not  use   static  then this
		System.out.println(s1);                     //   (sb1::append)  will not work
		
		
// normally thier is a quetion that we can not delete the elements of Arrays.asList(...);
		
// and also their was a question that we can not use String with String Builder. 
		
// but hier we are alloweed to do as we have  List<String> type   but not directly defined

// any String    like String s = new String("A","B","c");		
		
// and also we can not use   Steam  directly on String object.
		
// so as it is not directly a Sting so we can use it in StringBuilder		
	}

}
