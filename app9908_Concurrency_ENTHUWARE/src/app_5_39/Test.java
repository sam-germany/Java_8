package app_5_39;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

 class A1 {
	
    private  final ArrayList<String> theList = new ArrayList<String>();

    private final ReadWriteLock rwl = new ReentrantReadWriteLock();
    private final Lock r = rwl.readLock();
    private final Lock w = rwl.writeLock();
    
    public void write1(String data) {
   	 w.lock();
   	 
   	   try {
   		    System.out.println("Written "+data);
   		    theList.add(data);
   		    
		  } finally {
           w.unlock();
		       }
    }
    
    
	public String read1(int index) {
		r.lock();
		try {
			System.out.println("Reading");
             			
		          	if(theList.isEmpty()) {
			         	return null;
			       }else {
		    	       return theList.get(index);
		                }
		}finally {
			r.unlock();
		}}}
 

 public class Test{
	 public static void main(String[] args) {
		A1 a = new A1();
		
		
		a.write1("Sunny-111");
		
		System.out.println(a.read1(0));
		 
	}}
 /*
  i modified this question a little but easy to understand 
   
   
  
  */
 
 