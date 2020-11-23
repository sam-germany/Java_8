package app_2_41;

import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {
	
    Object v1 = IntStream.rangeClosed(10, 15)
    		             .boxed()
    		             .filter(x -> x > 12)
    		             .parallel()   // parallel Stream means if we have 4 core processos and we have
    		             .findAny();    //  Stream create 4 threads and these all will run parellely
    
    
    Object v2 = IntStream.rangeClosed(10, 15)
    		             .boxed()
    		             .filter(x -> x > 12)
    		             .sequential()  // sequential Stream means allthe elements will be executes
    		             .findAny();    // one by one only one Thread will be executing all
    
		
	}

}
