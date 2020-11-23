package app_2_61;

public class Test  extends Thread{
	  private int data =0;
	  private boolean done = false;
	  
	  public Test(int x) {
		  this.data = x;
	  }
	  public synchronized int getDate() {
		  return data;
	  }
	  public synchronized boolean isDone() {
		  return done;
	  }
	  
	  @Override
	public void run() {
           data += data;
           done = true;
	  }
	public static void main(String[] args) {

		Test [] t = new Test[3];
		
		for(int i=0; i<3; i++) {
			t[i]= new Test(i);
			t[i].start();               //as already explained .start()   method execute the .run()
		}                              // method and just draw in mind how the flow goes     
		
		for( Test x: t) {
			if(x.isDone()) {
				System.out.println(x.getDate()+"----------");
			}
		}
		
		
		
		
		
	}

}
