package app_3_61;

import java.util.concurrent.ThreadLocalRandom;

public class Test {

	 public void m1() {
		 
		 int r1 = ThreadLocalRandom.current().nextInt(1,10);   // hier it print between 1 and 9
	    System.out.println(r1);
	 }
	 
     public void m2() {
		 
		 int r1 = ThreadLocalRandom.current().nextInt(1,11);   // hier it print between 1 and 9
	    System.out.println(r1);
	 }
	
	public static void main(String[] args) {
 
    for(int i=0;i<5;i++) {
            	new Thread() {

		                   	@Override 
	             	     	public void run() {
				                   new Test().m2();
                        			}
	                  	}.start();
		
                }         	
	                  	
	}

}// we can use  .nextInt();  or .nextLong();
