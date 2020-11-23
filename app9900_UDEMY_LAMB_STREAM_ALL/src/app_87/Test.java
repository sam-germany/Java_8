package app_87;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		String [] arr1 = {"Virat","Rohit","Shikhar","Dhoni"};
		String [] arr2 = {"Bumrah","Pandya","Sami"};
		
		String [] arr3 = {};
		
		Stream<String []>  s1 = Stream.of(arr1 ,arr2 ,arr3);
		
		s1.flatMap(x -> Arrays.stream(x))
		                                 .sorted()
	                                   	 .forEach(x -> System.out.println(x+ " "));
	 	
		
		// s1.map(x -> Arrays.stream(x)).........
	
		// if we use  s1.map  and not s1.flatMap()     then we will get exception because we have used 
		// 23  String[] array
	
	}

}
