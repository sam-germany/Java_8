package app_2_62;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Test {

	public static void main(String[] args) {

		
		List<Integer> ints = new ArrayList<>();
		ints.add(10);
		ints.add(20);
		ints.add(30);
		
		Consumer<Integer> con1= System.out::print;
		
		Consumer<Integer> con2 = e -> System.out.println("  ,from con  "+ e*2 + "--");
		
		
		Consumer<Integer> c =con1.andThen(con2); // hier cons will be executed first for every element
		ints.forEach(c);                      // after that for the first element   con will be executed
		                                      // same flow one by one all elemetns will be executed
		
		
		ints.forEach(con2);
		
	}

}
