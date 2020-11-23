package app_6_39;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		String s1 = Arrays.asList("A","E","I","O","U")
				          .stream()
				          .reduce("-", String::concat);  //  it is equal to       (s1,s2) -> s1.concat(s2);
		
		System.out.println(s1);

		String s2 = Arrays.asList("A","E","I","O","U")
		          .parallelStream()
		          .reduce("-", String::concat);
		
		
		System.out.println(s2);
	}

}
/*
   just draw in mind
 
  the main point is   the elements in  Arrays.asList();  will be executed in same order but the concatination will be 
 
   done   parallely so we get the unpredicted output.
   
 
   



*/