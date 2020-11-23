package app_2_66;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {

	public static void main(String[] args) {

		int i = 2000;
		 Deque<Integer> d = new ArrayDeque<>();
		 d.add(100);
		 d.add(i);
		 d.add(300);
		 
		 d.forEach(System.out::println);
		 
		 
		 d.forEach( x -> System.out.println(x));
		 
		
		
	}

}
