package app64_;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
//before looking on this code think about app64_Factorials   how all the values goes in
//"int sum";  and at the end  all the values will be stored in "sum" and it print total "sum"
public class Test extends RecursiveTask<Double> {
	private int end;
	private int start;
	private Double[] weights;
	

	public Test(Double[] weights, int start, int end) {
	        this.start = start;
	        this.end = end;
        	this.weights = weights;
	}
	
	protected Double compute() {
		if (end - start <= 3) {
			double sum = 0;
			for (int i = start; i < end; i++) {
				weights[i] = (double) new Random().nextInt(100);
				System.out.println("Animal Weighed: " + i);
				sum += weights[i];
			              }
			     return sum;
			     
		} else {
			int middle = start + ((end - start) / 2);
			System.out.println( start +"  "+ middle +"  "+ end);
			RecursiveTask<Double> otherTask = new Test(weights, start, middle);
			otherTask.fork();
			return new Test(weights, middle, end).compute() + otherTask.join();
		}}
	public static void main(String[] args) {
		Double[] weights = new Double[10];
	
		ForkJoinTask<Double> task = new Test(weights, 0, weights.length);
		ForkJoinPool pool = new ForkJoinPool();
		Double sum = pool.invoke(task);
		System.out.println("Sum: " + sum);
	}
}
/* Always first understand the RecursiveAction code then come to RecursiveTask then it is easy to understand it
  the only part to understand is the else{} part rest is same as the RecursiceAction 
   as in  RecursiveAction we use invokeAll(obj1, obj2)  so from  that invokeAll()  we  cut the values into pices

   but hier in this code we use Test extends RecursiveTask<Double>  implements .compute() method and also
   in the  else part  we use the .fork() , .join() method so we use again their  RecursiveTask<Double>
   
   by this way in else part we use .fork()
   
   The fork() method submits the task to execute asynchronously. This method return this (ForkJoinTask) 
   and the calling thread continues to run.
   The join() method waits until the task is done and returns the result.

   Note: the important point to understand is the   else{} part their is a return ...;   this return will not
   return anything  to main method, this return we use only to invoke the   new Test( object);
   
    at the end all the greater values will be cut in smaller parts and all will be put in the if{} block
    and from their the sum += weights[i];  will be executed and at end we get the Total sum.
   
    
    

 
 


*/