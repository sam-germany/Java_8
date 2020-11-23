package app_6_19;

import java.util.stream.IntStream;

public class Test {
	
    public static void main(String[] args) {
    
    	
    	           IntStream.rangeClosed(1, 60)
    	                    .parallel()
		                    .filter( i -> i > 50)
                            .forEach(System.out::println);
    	
    	
    	System.out.println(".......................");
    	
    	
    	
    	
    	
    	 int res1 = IntStream.rangeClosed(1, 60)
      		            .filter( i -> i > 50)
      		            .findFirst()                  // main point is  .findFirst()   method check the base Stream
      		            .getAsInt();                  // as in this case IntStream is a sequential base Stream
    	                                              //we make it parallel but .findFirst() calls the sequential
    	 System.out.println(res1);                    // stream and  print 51 as output
    	 
    	
    	 System.out.println(".......................");
    	
    	
    	int res2 = IntStream.rangeClosed(1, 60)
    			           .parallel()
    	         		   .filter( i -> i > 50)
    	         		   .findFirst()
    	         		   .getAsInt();
    	
    	System.out.println(res2);
    }
}