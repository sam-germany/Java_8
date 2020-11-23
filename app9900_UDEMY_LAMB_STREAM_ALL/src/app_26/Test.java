package app_26;

import java.util.function.BiPredicate;

public class Test {

	public static void main(String[] args) {

		String[] arr = {"A","ab","bab","Aa","bb","bab","aba","Abab"};
		
	
//		BiPredicate<String, String> p = (s1,s2) -> s1.startsWith(s2);   //   same output
		
		BiPredicate<String, String> p  = String::startsWith;
		
		for(String x : arr) {
			if(p.negate().test(x ,"A")) {
				System.out.println(x);
			}
		}
		
	}

}
