package app_4_56;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		NavigableSet<String> s = new TreeSet<String>();
		s.add("a");
		s.add("b");
		s.add("c");
		s.add("dd");
		s.add("bb");
		s.add("xx");
		s.add("g");
		
		System.out.println(s);
		
		
	System.out.println(s.ceiling("c"));   //  "c"     .ceiling()  first check equal to or greater then 
	System.out.println(s.ceiling("ccc")); //  "dd"      just think .ceiling()  means "ccc" or greater then "c"
	                                      //       as  "d" is greater then "c"
	System.out.println(s.ceiling("y"));  //"null"   Note: if not same or greater then value found then "null"  is returned
		
		System.out.println("--------------");
		
	System.out.println(s.floor("a"));      // .floor();  first check equal to or  lower then
	System.out.println(s.floor("o"));       // just think .floor()  means "o"  or  lower then  "o"
		                                         // is   "g" in our case
	System.out.println(s.floor("2")); //"null"   Note: if not same or lower then value found then "null"  is returned
	
		System.out.println("***********");
		
	System.out.println(s.higher("z"));    // means only return higher element not same, if not found   
	System.out.println(s.higher("bb"));    // hier value then the given then return null
		
		System.out.println("--------------");
		
		System.out.println(s.lower("g"));  // means only return lower value not  the same , 
		System.out.println(s.lower("0"));    // if no lower value found then return null
		
	}

}
