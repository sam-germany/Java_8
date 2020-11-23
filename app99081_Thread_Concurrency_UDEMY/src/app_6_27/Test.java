package app_6_27;

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
	     int sum =0;
		
	           	if((to-from) <= 4) {
	          System.out.println(to+" "+from);
              
	          for(int i = from; i<=to; i++) {
        		         sum += i;
        	         }
            
        	   total +=sum;         // total = total+sum;   this means but it will not effect the 
                     
         }else {
        	   int mid = (from + to)/2;      
        	   System.out.println(from+" "+mid+" "+to);
        	   
        	   A1 first  = new A1(from  , mid);
        	   A1 second = new A1(mid+1 , to);
               invokeAll(first, second);               //  hier in this code the main point is to understand is
               total = first.total + second.total;     // when we execute the else{} statement. it means with the  
                                                      //  invokeAll()  method will be executed and then as in our
         }}}                                           // case the if() condition will be executed and   int total
                                                       // will be updated. after executing all the values  at end 
public class Test {                                   // the compiler come back again to  the else{} block and
	public static void main(String[] args) {           // at end we make a  total = first.total + second.total;
                                                     
		A1 a1 = new A1(1,20);
		
		ForkJoinPool pool = new ForkJoinPool(4);
		pool.invoke(a1);
		System.out.println(a1.total);
		
	}

}