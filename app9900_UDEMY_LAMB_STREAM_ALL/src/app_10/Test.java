package app_10;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        
    	m1(i -> i % 2 != 0);
    }
    
    private static void m1(Predicate<Integer> p) {
    	
        for(int i = 1; i <= 10; i++) {
            if(p.test(i)) {
                System.out.print(i);
            }
        }
    }
}