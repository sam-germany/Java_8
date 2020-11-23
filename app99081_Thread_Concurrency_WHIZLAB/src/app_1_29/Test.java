package app_1_29;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {

   int val = 10;
   int x;
   
    public Test(int i) {
    	val = i;
    }

    private AtomicInteger value  = new AtomicInteger(val);
    
    public static void main(String[] args) {

    	Test t  = new Test(5);
    	
    	System.out.println(t.value.decrementAndGet());
		
		
	}}
/*
  Main Point:  the value of AtomicInteger is assigned  in compile time not at run time,
                  as val = 10   is assigned at compile time so   the value.decrementAndGet()  return  9 as output
                  
 
 
 
 
 
 */
