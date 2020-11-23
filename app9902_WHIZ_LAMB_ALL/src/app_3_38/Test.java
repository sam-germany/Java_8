package app_3_38;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		long ls[] = {4,8,12};
		
		Arrays.parallelPrefix(ls, Long::sum);  // when compiler come hier this method will execute by itself
		                                        // and it make sum of 2 and put on second  index same goes
                                              // further
		for(long x: ls) {
			System.out.println(x);
		}
		
		System.out.println(Arrays.toString(ls));
		
	}

}
