package app_6_21;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class A1{
	private List<Integer>  list1 = new ArrayList<>();
	
	public synchronized void m1(int i) {
		list1.add(i);
	}
	
	public List<Integer> getList(){
		return list1;
	}
 }
public class Test {
	public static void main(String[] args) {

		 ExecutorService es = Executors.newFixedThreadPool(500);
		      
		           A1 a1 = new A1();
                                                       //(1)  () -> a1.m1(i);    inside Lambda expression if we use a 
		      for( int i=1; i<=1000;i++) {                    // local variable that local variable must be final
		         	  int x = i;                             // as int i   we use in loop so it is  incrementing every
		          es.execute(() -> a1.m1(x));               // time so  i  is no more final, this is the reason 
		      }                                            //  we do this step   int x = i;        and use  .m1(x); 
		                                    
		                                                 //(2) in loop  with every iteration es.execute() will be
		                                                 // executed and a new Thread will be created every time
		      es.shutdown();                             // 
		                                                 // read explantion about  .shutdown();   method
		      System.out.println(a1.getList().size());
		
	}

}
