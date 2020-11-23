package app_2_25;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String> l = Arrays.asList("A","E","I","o");
		
		l.set(2, "X");
		
//		l.add("X");
//      l.remove(3);             both add(), remove()  are  not alloweed	 
		
		l.forEach(System.out::println);
		
	}

}
