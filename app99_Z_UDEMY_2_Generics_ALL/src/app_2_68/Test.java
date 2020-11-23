package app_2_68;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		String [] s = {"a","x","d","y","r"};
		
		Arrays.stream(s).sorted((s1,s2)-> s1.compareTo(s2)).forEach(System.out::print);
		
		
		System.out.println("-------------");
	
	   
		Arrays.stream(s).sorted((s1,s2) -> s2.compareTo(s1)).forEach(System.out::print);
	
		
		// if we have List  then we use  list.stream()....    but for Array we  must use   Arrays. class methods
	
		
//		Arrays.stream(s).sorted(comparator);     it takes  comparator as argument
	
	
	}

}
