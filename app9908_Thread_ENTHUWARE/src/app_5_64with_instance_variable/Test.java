package app_5_64with_instance_variable;
public class Test {
	public int startHere = 1;
	public int endHere = 10;

        	void go(){
	                 Runnable a = new Runnable() {
                               		 	  @Override
			                              public void run() {
           		                        for( int i  = startHere; i <= endHere; i++) {
           				                      System.out.println(i);
           			                                                }
           		                        }};
           			                            
                 Thread t  = new Thread(a);
                 t.start();
	               }

        void go2(){
		          Thread a = new Thread() {
	            		                    public void run() {
    			                     	 for(int i= startHere; i<= endHere; i++) {
			                                      		         System.out.println(i);
			    	                                                }
    			                     	 }};
		 
           Thread t = new Thread(a);
           a.start();
	             }
	public static void main(String[] args) {
		Test t  = new Test();
		t.go();
		t.go2();
	
	}

}
