package app_6_44;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		
		double principle = 100;
		int interestrate = 5;
		
		double amount = compute2(principle , x -> x * interestrate);
	
	    System.out.println(amount);
	}
	
	
	
	 public static double compute2(double base, Function<Integer, Integer> func) {
		 return func.apply((int)base);
	 }
	
	 
	 
	public static double compute1(double base, Function<Double, Double> func) {
		 return func.apply(base);
	 }

// must read all the 5 options explanations then easy to understand the logic.	 
	
	 
}
