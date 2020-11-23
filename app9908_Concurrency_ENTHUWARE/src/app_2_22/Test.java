package app_2_22;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Test  extends RecursiveTask<Integer>{

	int [] ia;
	int from;
	int to;
	static final int THRESHOLD  = 3;    // note very important, we can not use static keyword in the constructor

	public Test(int[] ia, int from, int to) {
		this.ia = ia;
		this.from = from;
		this.to = to;
	}

	public int transform(int t) {
		return t;     // hier   .transform() method is a dummy method() it just take a value and same value 
	}                 // will be returned, in real time projects we can apply some  conditons on that value
	                   // and return another value like this, but hier it just simply return the same, so not to 
	@Override                        // think about this method() any more.
	protected Integer compute() {
        int sum = 0;
        
        if(from + THRESHOLD > to) {
        	System.out.println(from+" "+to);
        	
        	for( int i = from; i<=to; i++) {
        		sum = sum + transform(ia[i]);
        	                       }
         }else {
        	    int mid= (from + to)/2;
        	    System.out.println(from+" "+mid+" "+to);
        	    
        	    Test t1  = new Test(ia, from , mid);
        	    Test t2 = new Test(ia, mid+1,to);
        	    
        	    t2.fork();                            // we can put in any order  t2.fork() t2.join()  or we can put t1.fork()
         	     sum =  t1.compute() +t2.join();      //  t1.join()  output remain same
           }
                                               // the main point is as first time if() block does not execute after that else{} 
        return sum;                              //block executes and from else{} block we call again the if{} block and at end 
	                                             // the result come back to else{} and  total sum is added at this   point
	  }                                          //    sum =  t1.compute() +t2.join();       
	                                            
	                                           //  after that compile come out form else{} block and  return sum;   executes
	public static void main(String[] args) {  

		int ia[]  = new int[] {1, 2, 3, 4, 5, 6, 7};   // total 6 elements

	ForkJoinPool fjp = new ForkJoinPool();
	Test  test  = new Test(ia,0,6);
	
	int sum = fjp.invoke(test);
	
	System.out.println(sum);
	}}
/*
 part(1)   if(from + THRESHOLD > to)     means   if(0 +3> 6)    so if does not executes then else{} block will execute
 
             int mid= (from + to)/2;   means    3 = (0 + 6)/2;   after that compiler go to 
  
             Test t1  = new Test(ia, from , mid);    means   (0,  0,  3);
        	 Test t2 = new Test(ia, mid+1 , to);     means   (0, 3+1, 6);
part(2)   
now these both the objects will be executed but t1 will not execute the if{} lock but t2 will execute directly the if{} block 
first we go with t2        if(from + THRESHOLD > to)      if(4 + 3 > 6)    now as 7>6  then the if{} block execute and add
the values defined inside the ia[]  array.

part(3) 
now we come to  t1           if(from + THRESHOLD > to)       if(0 + 3 > 3)   as  3>3  return false then else block will execute

    int mid= (from + to)/2;     1= (0+3)/2;    1  will be return as mid.  
   
    Test t1 = new Test(ia, from , mid);    means (0,  0,  1);
    Test t2 = new Test(ia,  mid+1, to);    means (0, 0+1, 3);
    
after that  both t1, t2  will be executed in the if{} block and all the  values in the   int sum;  will be added

    if(from + THRESHOLD > to)  -----  if(0+3 >1);
    if(from + THRESHOLD > to)  -----  if( 1+3>3);   both these if{} block 
        	    
  
  
*/