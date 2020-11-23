package app_2_44;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		NavigableSet<String> s = new TreeSet<>(Arrays.asList("red","green","blue","gray"));
		
		System.out.println(s);  //  blue, gray, green, red
		
		
		System.out.println(s.ceiling("gray1"));  //green   return Greater then or equal to/same
		System.out.println(s.floor("gray1"));    //gray   return less then or equal to/same

		System.out.println(s.higher("gray"));  //green   return strictly Greater then 
        System.out.println(s.lower("gray"));   //blue   return strictly Less   then 
        
        System.out.println(s);  //[blue, gray, green, red]
	}

}
