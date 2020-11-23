package whiz_1_52;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;

public class Test {

	public static void main(String[] args) {

		List<String> ss = new ArrayList<>();
		ss.add("Shane");
		ss.add("Rachel");
		ss.add("Raj");
		
		BiFunction<String, String, Integer> bf = (s1,s2) -> Integer.compare(s1.length(), s2.length());
		Collections.sort(ss, bf::apply);
		System.out.println(ss);
		
		
		
// BiFunction<Integer, Integer, Integer> bf2 = (s1,s2) -> Integer.compare(s1,s2);
// Collections.sort(ss, (s1,s2) -> bf2.apply(t, u));             // this way lambda does not work do not know how it
// System.out.println(ss);                                                                     // it works  

		
      
// as we know Integer wrapper class has a    static method   .compare(int x, int y);		

//  important point is Collections.sort(ss, bf::apply);   how we are  using .apply() method		
	
	
		
	}}
