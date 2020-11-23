package app_02_DeadLock;

public class Test extends Thread {
	  boolean flag = false;
	
	public Test(boolean flag) {
		this.flag = flag;
	}

	static Object obj1 = new Object();
	static Object obj2 = new Object();
	
	       public void m1() {
	    	   synchronized(obj1) {
	    		   System.out.println("--1--");
	    		   
	    		            synchronized (obj2) {
	    		            	System.out.println("--2--");
							}}}
	       
	       public void m2() {
	    	   synchronized(obj2) {
	    		   System.out.println("--3--");
	    		   
	    		           synchronized(obj1) {
	    		        	   System.out.println("--3--");
	    		           }}}
	
        	@Override
	        public void run() {
                if(flag) {
                	m1();
                	m2();
                }else {
                	m2();
                	m1();
                }
	         }
	public static void main(String[] args) {

		 new Test(true).start();
		 new Test(false).start();
	}

}
