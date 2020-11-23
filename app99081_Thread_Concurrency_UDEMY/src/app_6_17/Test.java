package app_6_17;

import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
       
    	             IntStream.rangeClosed(1, 10)
                              .forEach(System.out::println);
    	
    	
    	
             System.out.println("----------------");
    	             
    	     
             
                    IntStream.rangeClosed(1, 10)
                             .parallel()
                             .forEach(System.out::println);
    }
}