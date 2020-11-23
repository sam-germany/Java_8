package app_5_23;

class A2 extends Thread{
	
	@Override
	public void run() {
         System.out.println( " In  A class");
	}
}
class B2 extends Thread{
	
	public B2 () {}
	
	public B2(Runnable r) {  
		super(r);        
	}                     
	
/*	                       
	@Override               
	public void run() {
          System.out.println("In B class");
	}*/
}
public class Test3 {
	public static void main(String[] args) {

		A2 a1 = new A2();
		
		Thread h = new B2(a1);
	
		h.start();
	}
}
// see the difference as i hide the  B1 Class  constructor