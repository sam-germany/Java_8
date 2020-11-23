package app_1_67;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {

		
		Function<String, Double> fun1 = Double::parseDouble;
		
		Double d= fun1.compose( x -> x+ ".01")  
				      .andThen(x ->  x*3)       
				      .apply("2");
		
		System.out.println(d);
	}

}
/*  the flow goes like this.    
 (1) hier first  .apply()  is called  on   .compose()  method, and it will add  "2" + ".01"     "2.01" 
 (2)  after that  Function<String,Double> fun1       will be executed and it convert String into double
                                                   makes  "2.01"  to   2.01  double
 (3) after that  .andThen() will be called    2.01 x 3   make   6.01                                                  
                                                   
 


*/