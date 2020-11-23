package app_5_23;

class A1 extends Thread{
	
/*	@Override
	public void run() {
         System.out.println( " In  A class");
	}*/
}
class B1 extends Thread{
	
	public B1 () {}
	
	public B1(Runnable r) { 
		super(r);         
	}                     
	                     
	                       
	@Override                 
	public void run() {
          System.out.println("In B class");
	}
}
public class Test2 {
	public static void main(String[] args) {

		A1 a1 = new A1();
		
		Thread h = new B1(a1);
	
		h.start();
	}
}

 // see the difference as i hide the  A1 Class  constructor
 
 
 


