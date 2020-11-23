package app_6_57;

import java.util.Arrays;

public class Test {

	static String[] sa = {"charlie", "bob", "andy", "dave"};
	
	public static void main(String[] args) {

		Arrays.sort(sa);
		
		System.out.println(Arrays.binarySearch(sa, "andy"));
		
		
		
	}

}
