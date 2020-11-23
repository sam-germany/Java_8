package app65_RecursiveAction;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

//before looking on this code think about app64_Factorials   how all the values goes in
//"int sum";  and at the end  all the values will be stored in "sum" and it print total "sum"
public class Test extends RecursiveAction {
	private int start;
	private int end;
	private Double[] weights;

	public Test(Double[] weights, int start, int end) {
		this.start = start;
		this.end = end;
		this.weights = weights;
	}

	protected void compute() {
		if (end - start <= 3)
			for (int i = start; i < end; i++) {
				weights[i] = (double) new Random().nextInt(100);
				System.out.println("Animal Weighed: " + i);
			}
		else {
			int middle = start + ((end - start) / 2);
			System.out.println(start + "  " + middle + "  " + end );
			invokeAll(new Test(weights, start, middle), new Test(weights, middle, end));
		}
	}
	public static void main(String[] args) {

		Double[] weights = new Double[10];

		ForkJoinTask<?> task = new Test(weights, 0, weights.length);
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(task);
		System.out.println();
		System.out.print("Weights: ");             //    as it weights[] has double value so we convert into int value
		Arrays.asList(weights).stream().forEach(d -> System.out.print(d.intValue() + " "));
	}
}
/* Always first understand RecursiveAction after that go to RecursiveTask
   
 Part(1):  as at first step if() will not be executed so else part will be executed and 
  
   invokeAll( new Test([],0,5),  new Test([],5,10));
   
   after that for these 2 Test objects defined in the invokeAll() methods,
   for   first Test object the down  defined Part (2),(3)  will be executed and after that same order for 
   the second Test object  will be done , same calculation will be done.
  
 
Part (2):
--------                                              5/2 = 2
 int middle = start + ((end - start) / 2);      0 + ((5 - 0) / 2);  output 2  so hier middle become 2

  after this line the invoikeAll( new Test([],0,2), new Test([],2,5));
  
  and not this can be putted in the  if() statement and will be their executed

 Part(3):
 -------
 
  int middle = start + ((end - start) / 2);      5 + ((10 - 5) / 2);  output 7  so hier middle become 2

  after this line the invoikeAll( new Test([],5,7), new Test([],7,10));
  
  and not this can be putted in the  if() statement and will be their executed
   
   
*/