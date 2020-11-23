package app_22;

import java.util.function.BiFunction;

public class Test {

	public static void main(String[] args) {

		
//	  BiFunction<Double, Double, Integer> c = (s1,s2) -> s1.compareTo(s2);  //  this is same
		
		BiFunction<Double, Double, Integer> c = Double::compareTo;
		
		System.out.println(c.apply(10.5,8.5 ));           
		
		
		
// as we know   a>b  = 1 as output     a<b = -1     a =b  = 0 as output   		
		
// 	in Double class their is  a  static int  .CompareTo()   method it takes double and return a int value
		
//  this is the reason in BiFuncation we take  2 Double and return type is  Integer		
		
	}

}
