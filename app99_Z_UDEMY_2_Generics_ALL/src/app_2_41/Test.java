package app_2_41;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	  public static void main(String[] args) {
		  
		  
		  Set<Character> set = new TreeSet<>(Arrays.asList('a','b','c','A','a','c'));
	
		  set.stream().forEach(System.out::print);
	    }
	}
/*
Character and all wrapper classes implement Comparable interface,
hence Characters are sorted in ascending order.

*/