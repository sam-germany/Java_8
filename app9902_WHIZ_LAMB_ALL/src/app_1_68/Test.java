package app_1_68;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		
		Function<Integer, String> fun1 = s->s.toString();
		
		Function<String, String> fun2 = fun1.andThen( s  -> s+"2")
				                            .compose( s  -> Integer.parseInt(s));
	
		System.out.println(fun2.apply("3"));
	
	}
}
/*
 (1) first  fun2 is  .apply("3")  is called and then 
 (2) in fun2  .compose() is called it makes   String "3" into  3  integer  and 
 (3) after the Function<Integer, String> fun1    is called  as it take Integer and return String
    so  3 goes their and .toString()  convert into  String   "3"   
 (4) after that   .andThen() is called   "3" + "2"  makes   "32"  as output.      

*/