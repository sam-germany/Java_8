package app_11;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {

		String[] arr= {"*","++","+++","+++++","+++"};
		
		Predicate<String> pr  = s -> s.length() > 2;
		
		print1(arr,  pr.negate());
	}
	
	private static void print1(String[] arr, Predicate<String> p) {
		
		for(String x :arr) {
			if(p.test(x)) {
				System.out.println(x);
			}
		}
	}

}
