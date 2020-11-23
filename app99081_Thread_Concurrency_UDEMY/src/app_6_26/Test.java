package app_6_26;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
//before looking on this code think about app64_Factorials   how all the values goes in
//"int sum";  and at the end  all the values will be stored in "sum" and it print total "sum"
class A1 extends RecursiveAction{

	    private int from;
	    private int to;
	    int total = 0;
	    
	    A1(int from , int  to){
	    	this.from = from;
	    	this.to= to;
	    }
   	
	@Override
	protected void compute() {
		
	           	if((to-from) <= 4) {
	            	System.out.println(to+" "+ from);
	           		
	           	int sum = 0;   	 
              for(int i = from; i<=to; i++) {
        		         sum += i;
        	         }
            
        	    total +=sum;            // total = total+sum;      in this case the else{} block will not 
                                        //                      be executed.
         }else {
        	   int mid = (from + to)/2;      
        	   System.out.println(to+" "+mid+" "+from);

        	   A1 first  = new A1(from  , mid);
        	   A1 second = new A1(mid+1 , to);
               invokeAll(first, second);
         }}}
public class Test {
	public static void main(String[] args) {

		A1 a1 = new A1(1,5);
		
		ForkJoinPool pool = new ForkJoinPool(4);
		pool.invoke(a1);                                 // .invoke() method will take a object as argument of class
		System.out.println(a1.total);                   // which extends from RecursiveAction or RecursiveTask
		
	}}