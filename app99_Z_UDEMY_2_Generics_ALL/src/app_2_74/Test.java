package app_2_74;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<StringBuilder> l = new ArrayList<>();
		l.add(new StringBuilder("abc"));
		l.add(new StringBuilder("xyz"));
	   
		l.stream().map(x -> x.reverse()).forEach(System.out::println);
		
		
		System.out.println("-------------");
		
		System.out.println(l);
	}}

// main point is  as we are using    List<StringBuilder>  the changes done 
//     in   Stream  are reflecting back

 