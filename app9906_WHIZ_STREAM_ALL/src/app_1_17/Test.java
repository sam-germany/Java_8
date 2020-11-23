package app_1_17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		
		l.add(1);
		l.add(7);
		l.add(4);
		l.add(3);
		l.add(5);
		
		Predicate<Integer>  pr  = p-> p > 4;
		Consumer<Integer>  cons = System.out::println;
		
		            l.stream()
		             .filter(pr.negate())
		             .forEach(cons);
		
		//  Note   as List<> is of Generic type  then it is recommended to take all as Generic type
		// this is the reason we are taking Predicate<Integer>  and Consumer<Integer>
	}

}
