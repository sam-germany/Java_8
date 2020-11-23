package app_5_60;

import java.util.Collection;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		Collection<String> c  = new TreeSet<>(); //as in the print1() method take a argument of Collection<String>
		                                          //so we must also use hier the same, and as we need Sorted output
		c.add("tom");                             //so need  TreeSet<>   and as String class by-default implement
		c.add("dick");                            //comparable so  DNSO ,  we can use it in the TreeSet<String>
		c.add("harry");                     
		c.add("tom");
		
		
		print1(c);
	}

	
	private static void print1(Collection<String> list) {
		
		for(String s : list) {
			System.out.println(s);
		}
	}
	
}
