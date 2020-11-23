package app_6_24;

import java.util.concurrent.atomic.AtomicInteger;

public class Test {

	public static void main(String[] args) {

		AtomicInteger ai = new AtomicInteger(10);              
	 
		System.out.println(ai.addAndGet(1)+" : "+ai);                //11 : 11
		 
		System.out.println(ai.incrementAndGet()+"  :  "+ai.get());     //11 : 11
		
		System.out.println(ai.getAndAdd(1)+"  :  "+ai.get());         //10  : 11
		
		
		System.out.println(ai.incrementAndGet()) ;         
	
//		System.out.println(ai.incrementAndGet(1)) ;     //this gives us error , this method does not take argument.
	}}

/*
 Note:   hier   System.out.println(ai)   and   System.out.println(ai.get())  both give us same output
  
  
  
  
 
 */
