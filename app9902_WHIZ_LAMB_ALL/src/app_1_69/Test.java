package app_1_69;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {

		
		String in  = "Whizlab";
		Predicate<String> p = s->s.indexOf("i") > 0;
		
		System.out.println(p.and(s -> s.length()> 4).negate().test(in));
		
/*
(1) first we call   Predicate  p.test(in)	 it return true as   .indexOf("i") > 0
(2) after that  .and("Whizlab")  will be executed and it return true
(3) after that  .negate()  makes    true   to  false    it is printed		
		
		
*/		
		System.out.println(p.negate().or(s -> s.length() > 4 ).test(in));
		
	
// same explantion as above but without  .negate();		
		
}}
