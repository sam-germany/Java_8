package app_0_34;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class Sum1 extends RecursiveTask<Long>{
	
	static final int MAX = 5000;   // Note:  static varables we are not alloweed to put in 
	                               // the constructor.
	int[] array;
	int low;
	int high;
	 
	public Sum1( int[] array, int low, int high) {
		this.low = low;
		this.high = high;
		this.array = array;
	}                                          // the main point is all the tasks will be splitted and al the
                                               // result will be saved in the   "sum" and at end it returned
	@Override
	protected Long compute() {            
		
        if(high - low <=MAX) {
        	
        	System.out.println(low+" "+high);
        	
         	              long sum = 0;
         	
                         	for(int i = low; i<high; ++i) {   //  ++i   we use but it has same effect as we use
        		                     sum +=array[i];             // always   i++
                                    	}
              return sum;        	
        }else {
                int mid = low +(high-low)/2;
                
                System.out.println(low+" "+mid+" "+high);
                  
                  Sum1 left = new Sum1(array, low, mid);
                 Sum1 right = new Sum1(array, mid, high);

     
              left.fork();  
              long rightAns = right.compute();
              long leftAns = left.join();
           
           return leftAns + rightAns;
        }}
	
	  static long sumArray(int[] array22) {
		
		ForkJoinPool fPool = new ForkJoinPool();
		long sum = fPool.invoke(new Sum1(array22,0,array22.length));
		
		return sum;
}                     }
public class Test {
	public static void main(String[] args) {

		int[] a = new int[15000];
		
		for(int x=0;x<15000; x++) {
			a[x] = 1;
		}
//		Sum1 s = new Sum1(a,0,a.length);               this will never used
		System.out.println(Sum1.sumArray(a));

}}