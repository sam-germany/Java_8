package app_3_60;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
public class Test {

	private Map<String, Integer> marksObtained1 = new HashMap<>();
	private ReadWriteLock l1 = new ReentrantReadWriteLock();
	
	public void setMarksInSubject( String subject, Integer marks) {
		
		l1.writeLock().lock();
	
	     try {
			marksObtained1.put(subject, marks);
		} finally {                                      //  in this method method we put   .writeLock().lock();
               l1.writeLock().unlock();                 //                                  .writeLock().unlock():
		}}                                              // for unlocking we use this in finally{} block as finally{}
	                                                   // block must execute so like this we can unlock it
	public double getAverageMarks() {    
	       l1.readLock().lock();	
		double sum = 0.0;
		
		try {
			for( Integer mark: marksObtained1.values()) {
			        	sum = sum + mark;
			        }  
			  return sum / marksObtained1.size();      	
		}finally {
		                                                    //  in this method method we put   .writeLock().lock(); 
			l1.readLock().unlock();                         //                                  .writeLock().unlock():
		                                               	// for unlocking we use this in finally{} block as finally{}
		}}                                                      // block must execute so like this we can unlock it
	public static void main(String[] args) {

		final Test s = new Test();
		
		        new Thread() {
			         public void run() {
				           int x  = 0;
				              while(true) {
					          int m  = (int)(Math.random()*100);
					          s.setMarksInSubject("Sub  ", m);
				                }}	
	       		  }.start();
		

	     for(int i=0;i<5; i++) {
	    	        new Thread() {
	    	    	          
	    	        	     public void run() {
	    	    		                 while(true) {
	    	    			             double av = s.getAverageMarks();
	    	    			               System.out.println(av);
	    	    		                              }
	    	    	                         }
	    	                }.start();
	            }

}}