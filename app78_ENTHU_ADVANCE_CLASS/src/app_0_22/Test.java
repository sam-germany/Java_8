package app_0_22;

import java.util.Arrays;

public class Test {

	static String[] sa = {"aa1","aa","aaa","aaaa"};
	
	static {
		//Arrays.sort(sa);
	}
	public static void main(String[] args) {

		for( String x : sa) {
			System.out.println(x);
		}
		
		String search = "";
		
		System.out.println("--------------");
		
		if(args.length != 0) search = args[0];
		
		System.out.println(Arrays.binarySearch(sa, search));
		
	}

}
