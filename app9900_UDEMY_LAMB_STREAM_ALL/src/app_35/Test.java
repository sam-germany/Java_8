package app_35;

import java.util.function.UnaryOperator;

public class Test {

	public static void main(String[] args) {
		
		final String password1 = "Oracle";

//		UnaryOperator<String> opr1 = s -> s.replace("a", "@");       both will work   ""  or  ''
		
		UnaryOperator<String> opr1 = s -> s.replace('a', '@');
		UnaryOperator<String> opr2  = s -> password1.concat(s);
		

		System.out.println(opr1.apply(opr2.apply("-??")));     //(1)   (opr2.apply("-??")  --- Oracle-??   
		                                                    //       first this will be called and give us         
		                                                    //   a  output after concatination  Oracle-??
		System.out.println(opr2.apply("-??"));          
		                                                //(2)   opr1.apply(...)    after concatination this
		                                              
		                                             //  apr1   is called and it replace 'a'  with '@'
		
		
	// Rule:   first  ( outer(inner))   always "inner" execute first then "outer"
		
	}

}
