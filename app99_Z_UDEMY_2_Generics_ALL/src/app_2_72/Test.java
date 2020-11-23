package app_2_72;

import java.util.stream.LongStream;

public class Test {

    public static void main(String[] args) {
    	
        LongStream.iterate(0, i -> i + 2).limit(4).forEach(System.out::print);
        
        
        System.out.println("---------------------");
        
        
        LongStream.iterate(1, i -> i + 2).limit(4).forEach(System.out::print);
        
    }
}