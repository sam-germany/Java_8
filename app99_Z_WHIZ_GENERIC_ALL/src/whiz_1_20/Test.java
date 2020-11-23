package whiz_1_20;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();
		
		l.add(1);
		l.add(5);
		l.add(2);
		l.add(3);
		
		Predicate<Integer> p  =  x -> x >2;
		
		l.stream().filter(p);  //   if we put .forEach() method directly hier then  it make the Predicate check.
		
		l.forEach(System.out::println);
		
		System.out.println(l);
	}

}
