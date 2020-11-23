package app_2_62;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	
	private static String p1(String swiftCodes) {
		return swiftCodes.substring(1,2);
	}
	private static String p2(String swiftCodes) {
		return swiftCodes.substring(0,1);
	}

	private static String p3(String swiftCodes) {
		return swiftCodes.substring(3,4);
	}
	
	private static void printCodes1(List<String> l) {
		for(String str :l) {
			System.out.println(str);
		}
	}

	
	public static void main(String[] args) {
     List<String> swiftCodes = Arrays.asList("bbbb","cccc","dddd","aaaa");
		
		Comparator<String> a2 =  Comparator.comparing(Test::p1)
				                           .thenComparing(Test::p2)
                                           .thenComparing(Test::p3);      // if these p1,p2,p3 methods are not static
				                                                           // then we are not able to call them like this
		Collections.sort(swiftCodes, a2);                            //because Comparator<String>   is of <String> type
	      	printCodes1(swiftCodes);                                // when Comparator<Test>  then we can call also
	      	                                                        // non-static methods of Test class
	
	}
// main point is we defined Comparator outside   .sort() method and after that we use it in .sort() method.
	

	
}
