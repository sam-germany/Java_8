package app_3_70;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

		IntStream str  = IntStream.range(1, 3);
		
		IntConsumer cons = System.out::print;
		
//		cons.accept(str);      //IntConsumer .accept(int);   this will not compile as we are     
		                      //                                   passing IntStream as argument
		
		cons.accept(str.sum());   //  cons.accept(int); this works as  .sum() return  int value  
		
		                                       // note main point if we use premitive type  of one Functionl
		                                       // interface then we have to further also use premitive type
		                                       // as hier if we use IntStream then further we must use
		                                       // IntConsumer  otherwise code will  not compile
	}

}
