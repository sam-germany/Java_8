package app_4_61;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {

		String in  = new String("1");
		
		Predicate ins = Predicate.isEqual(in);
		
		System.out.println(ins.test("2")); // false
		
		// "1"  if we pass   "1" then come true as output
		
	}

}
