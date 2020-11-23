package app_5_37;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		ArrayList l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(2);
		
		             l.parallelStream()
		              .distinct()
		              .peek(System.out::print)
		              .count(); // it print only 12   elements of the list
		
		
		System.out.println();
		
		
		System.out.println(   l.parallelStream()
				               .distinct()
				               .peek(System.out::print)
				               .count()
				               
				          );  // it print also the count() also
		
	}

}
