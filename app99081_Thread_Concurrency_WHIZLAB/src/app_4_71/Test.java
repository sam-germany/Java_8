package app_4_71;

// little hard example but not need to understand it

public class Test {

         	public static class Mul{
	          
         		    private int num;
	                     }

            private Mul n1 = new Mul();
            private Mul n2 = new Mul();
            
            
            public void setNum(int i , int j) {
            	
            	synchronized(n1) {
                          synchronized(n2) {
                        	  n1.num = i;
                        	  n2.num = j;
                                }}
                  }

            
            
           public int multi() {
        	   
        	   synchronized(n2) {
        		   synchronized(n1) {
        			   
        			   return (n1.num * n2.num);
        		   }
        	   }
           }
}
