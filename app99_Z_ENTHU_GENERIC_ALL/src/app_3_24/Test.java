package app_3_24;

import java.util.Arrays;
import java.util.Comparator;

class MyStringComparator implements Comparator{
	
	  @Override
	public int compare(Object o1, Object o2) {

		  int s1 = ((String) o1).length();
		  int s2 = ((String) o2).length();
		  
		  return s1 - s2;                   // it is same as i already define the  .compare() method but
		                                    // hier we modify the way of sorting directly from  String
		                                    // to the length of String.
	}}
public class Test {
	
	static String [] sa = {"d","bbb","aaaa"};
	
	public static void main(String[] args) {

		System.out.println(
		                   Arrays.binarySearch(sa, "cc",   new MyStringComparator()) 
		                   );
	   
// as "cc"  the length does not match with the given    String[] sa    Array, so compiler search for the
// expected position, in our case it is after "d"   so 1 index then  the output should be 
//    -(index +1)    so   -(1+1) =  -2  is output	
		
		
		
		
		System.out.println(
                    Arrays.binarySearch(sa, "e",   new MyStringComparator()) 
                           );

// as in this case the "e" length is matched with the "d"  so the index of the "d"  is o  zero as output
		
//  the main point in this code is as we modify the  .compare() methos so we are not comparing on the
// String character , we are comparing on the String length.
		
		
	}}