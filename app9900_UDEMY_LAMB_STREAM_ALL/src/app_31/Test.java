package app_31;

import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;

public class Test {

	public static void main(String[] args) {

//                                                11 -> 24 -> 11 + 24		
		DoubleFunction<DoubleUnaryOperator> func = m -> n -> m + n;
		
		System.out.println(func.apply(11).applyAsDouble(24));
		
	}

}
/* Just draw this in mind
 
 
  DoubleFunction < DoubleUnaryOperator >   just draw in mind   DoubleFunction take a doube value and return 
  as we define.
  < DoubleUnaryOperator >    it takes a  double value and do some operation on it and return the same
                           double value back.
  
Note: as  <DoubleUnaryOperator>  return a double value so the return type of DoubleFunction is also double                               
  
 
 
to understand it just think this  example in mind  then it is easy to understand


                                                     11
       DoubleFunction < DoubleUnaryOperator > func = (m) -> { 24
                                                       return (n) -> {  11 + 24  
                                                                  return m + n;
                                                                     };
                                                       };

//Note:   return (n)    in this code  this line means the returned type is desided on the basis of  (n)

*/