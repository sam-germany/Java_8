package whiz_0_63;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.ToDoubleBiFunction;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		Map<Integer, Double> m = new HashMap<>();
		m.put(2, 2.2);
		m.put(1, 1.1);
		m.put(3, 3.3);
		
		ToDoubleBiFunction<Double, Integer> t = (a,b) -> a+b;
		m.forEach((k,v) -> System.out.println(t.applyAsDouble(v, k)));

//		ToIntBiFunction<Integer,Double> t = (a,b) -> a+b;        // as we are adding a  double + int  then always a hiegher
//		m.forEach((k,v) -> System.out.println(t.applyAsInt(k, v))); // value is the output so double is the output
                                                                   //  if we try to put like this then compilation error
		
	
//              byte > short > int > long > float > double		
	}

}
