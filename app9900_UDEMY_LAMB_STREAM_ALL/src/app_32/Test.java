package app_32;

import java.util.function.LongFunction;
import java.util.function.LongUnaryOperator;

public class Test {

	public static void main(String[] args) {

//                                           105 -> 50-> 50 - 105;     output  -55		
		LongFunction<LongUnaryOperator> func = a -> b -> b - a;
		
		System.out.println(   m1(func.apply(105),50)  );
		
	}

	private static long m1(LongUnaryOperator op, long val) {
		return op.applyAsLong(val);
	}
}
/*
        LongFunction<LongUnaryOperator> func = (a) -> {
                                                     return (b) -> {
                                                                 return b - a;
                                                                    };
                                                     };


Note:  m1(func.apply(105)       LongFunction take  105   and return  a long value, this returned value will
                                be decided on the basis of   LongInaryOperator
                                
    m1(func.apply(105),50)   ---   m1(LongUnaryOperator op, long val)   
    
                                now for  LongUnaryOperator   50  will be given    rest is easy to understand

*/