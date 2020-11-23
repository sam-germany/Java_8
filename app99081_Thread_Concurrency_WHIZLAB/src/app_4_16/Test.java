package app_4_16;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
	
    static class Task1 implements Callable<Integer>{

        @Override
		public Integer call() throws Exception {
	       return 1;
     }}

    static class Task2 implements Callable<Integer>{
    	
    	@Override
    	public Integer call() throws Exception {
    		return 2;
   	}}
    
    
    static class Task3 implements Callable<Double>{
    	
    	@Override
    	public Double call() throws Exception {
    		return 3.0;
     }}
    
public static void main(String[] args) throws InterruptedException, ExecutionException {

final ExecutorService pool = Executors.newFixedThreadPool(5);

List<Callable<Integer>>  cal = new ArrayList<>();

cal.add(new Test.Task2());           // cal.add(new Task2());
cal.add(new Test.Task1());           // cal.add(new Task1());      with this type we can also call the Test()  


// List<Future<Integer>> futures = pool.invokeAny(cal);     this we can not use becuase Task3 is type of Double and 
//                                                           and we provide as return type  List<Future<Integer>>
  
System.out.println(pool.invokeAny(cal));          
    

pool.shutdownNow();


}}//Note:  it is same example as the   app_2_38       the only difference is hier we use    pool.invokeAny(cal);  