package app_08_Collections_Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


class Name{
	String first;
	String last;

	public Name(String first, String last) {
		this.first = first;
		this.last = last;
	}
	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}
	
     @Override
    public String toString() {
    	return first +" "+ last;
    }}
public class Test {
	public static void main(String[] args) {

		List<Name> names = Arrays.asList(new Name("dd","11"),
				                         new Name("bz9","22"),                                         
				                         new Name("cc","33")
				                         );
		Collections.sort(names,(x,y)-> x.getFirst().compareTo(y.getFirst().toLowerCase()));
		
		System.out.println(names);
		
		
		
		
		
		Collections.sort(names,(x,y)-> x.getFirst().toLowerCase().compareToIgnoreCase(y.getLast().toLowerCase()));
		System.out.println(names);
}}
/*
 
 Collections.sort(comparator);         .sort() method take comparator as argument.
 
 as we are trying to compare String values, so it compare through  ASCII values only on the basis of first
 character defined in the String this is the reason   "bz" come before  "cc"
 
 */