package app_2_40;

import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

		IntStream in1 = IntStream.of(11,2,7,32,4,8,21,9);
		
		int x1 = in1.filter( in -> in %2 == 0)
				    .reduce(0, Integer::sum);

		System.out.println(x1);
//      x1.forEach();    not alloweed as  .reduce() method return  int value not IntStream so , it is not Stream
//                                          so we can not call  .forEach() method on x1
		System.out.println("---------------------------------");
		
		
	
		
		IntStream in2 = IntStream.of(11,2,7,32,4,8,21,9);
		
		int x2 = in2.filter(in -> in % 2 ==0)
				    .reduce(0,  (a,b)-> a+b);
		
		System.out.println(x2);
	}

}
