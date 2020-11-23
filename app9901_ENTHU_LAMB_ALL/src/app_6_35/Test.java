package app_6_35;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Integer> names = Arrays.asList(1,2,3);
		
		 names.forEach(x -> x= x+1);
		 
		 System.out.println(names);
		
		 
// as explained in old examples  the elements of Arrays.asList();  can not be changed, just think about in the
//   begining  when we hava a variable and call that variable in a method and change its value that 
//  value of that variable will not be reflected back. but if it is a Object then it will be reflected back.
		 
	}

}
