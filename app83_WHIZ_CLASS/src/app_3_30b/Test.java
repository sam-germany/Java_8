package app_3_30b;



public class Test {

	private static volatile Test test;
	
	private Test() {}
	
     public static  Test getInstance() {
    	 
    	 if(test ==  null) {
    		 synchronized(Test.class) {
    			 if(test == null) {
    				 test = new Test();
    			 }
    		 }
    	 }
    	 return test;
     }
	
	

}
