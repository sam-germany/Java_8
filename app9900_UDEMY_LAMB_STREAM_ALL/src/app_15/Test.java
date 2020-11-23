package app_15;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {

		String[] arr  = {"A","ab","bab","Aa","bb","baba","aba","abab"};
		
		Predicate<String> p1 = s -> s.startsWith("A"); 
		Predicate<String> p2 = s -> s.startsWith("a");
		Predicate<String> p3 = s -> s.length() >= 3;
		
		process1( arr, p1.and(p3));
	}
	
	public static void process1(String [] arr, Predicate<String> p) {
		
		for(String x :arr) {
			if(p.test(x)) {
				System.out.println(x);
			}
		}
	}

}
// simple to understand for every iteration single  String element  it take and
// then it check
//(1)  p1 | p2   means   p1 or p2      every element which pass  p1 or p2 then it will go to

// go to p3   it check the p3 condition  and after that if() statement will be executed.