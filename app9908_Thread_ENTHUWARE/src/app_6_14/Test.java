package app_6_14;

public class Test extends Thread {
		static int x;
		static int y;
		
		public static synchronized void setX(int i) {
			                                        x++;
		                                          }
		
		public static synchronized void setY(int j) {
		                    	                   y++;
	                	                          }
	
		public void setXY(int i , int j) {
			setX(i);                               // hier we are passing  (int i) to setX(int i) method
			setY(j);                               //point:  this (int i) has no link with  x++;
		}                                         // this (int i)  we use just for calling  setX(..) method 
		
		public boolean testXY() {
			              //   System.out.println(x);
			               //  System.out.println(y);
			return x != y;
			
		}
		
		@Override
		public void run() {
			setXY(3,3);              // this is little trickey, the values we put hier are dummy values
			System.out.println(x);   // this we use in the code just to execute the method after that
			System.out.println(y);           // these values will not be used
			System.out.println( testXY() );
		}

		public static void main(String[] args) {
    	        new Test().start();
    	        new Test().start();
     }		
	

}
