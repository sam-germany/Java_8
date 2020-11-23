package app_3_64;

import java.util.HashMap;
import java.util.Map;
import java.util.function.ToDoubleBiFunction;

public class Test {

	public static void main(String[] args) {

		Map<Integer, Double> m = new HashMap<>();
		m.put(1, 12.7);
		m.put(2, 13.5);
		m.put(3, 18.5);
		
		ToDoubleBiFunction<Integer, Double> tdf = (a,b) -> a+b;
		
		m.forEach((k,v) -> System.out.println(tdf.applyAsDouble(k, v))); 
		
		
	}

}
