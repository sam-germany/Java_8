package appp_104;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(10,20,8);
	
		System.out.println(   l.stream().max(Comparator.comparing( a -> a)).get()  );
	
		System.out.println(   l.stream().max(Integer::compareTo).get()     );

		System.out.println(   l.stream().max(Integer::max).get()    );
		
	
		
   // .max()  method of Stream take Comparator so we can pass anything like above 
  //  but the third line will not print exact output  because   Integer  .max(x,y)   max() method of	
  // integer take 2 paramaters
		
		
	}
	

}
