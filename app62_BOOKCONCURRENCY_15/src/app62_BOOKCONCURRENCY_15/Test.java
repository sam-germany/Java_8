package app62_BOOKCONCURRENCY_15;

import java.util.Arrays;
import java.util.function.BiFunction;

public class Test {

	int i;
	
	public void t1() {
		BiFunction<Integer, Integer, Integer> accumulator= (a,b) -> 5;

	System.out.println(Arrays.asList(1,2,3,4,5)
			.parallelStream()
			.reduce(0,accumulator,(s1,s2) -> s1+ s2));
	
	}
	public static void main(String[] args) {

		Test t= new Test();
		t.t1();
		
	}

}
