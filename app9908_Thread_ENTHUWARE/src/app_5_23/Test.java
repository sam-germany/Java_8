package app_5_23;

class A extends Thread{
	
	@Override
	public void run() {
         System.out.println( " In  A class");
	}
}
class B extends Thread{
	
//	public B () {}
	
	public B(Runnable r) {  // as their is not A(argument) constructor is defined in the A class
		super(r);          // hier it look like that we are calling the A(args) constructor of the A class, but just
	}                      // see the code in  the main method we are sending   new B( A() );
	                       //  it shows clearly that through  super(r)  we are sending  super(A())   and in this way
	                       // no-args  constructor of the A() class will be executed, but as  the object is of B class
	@Override                   // type    Thread h  = new B(a1);  so the run() method of B class will be executed
	public void run() {
          System.out.println("In B class");
	}
}
public class Test {
	public static void main(String[] args) {

		A a1 = new A();
		
		Thread h = new B(a1);  // point: as class A also extends from  Thread, this is the reason that we can send  
	                           //  new B( new A());  as constructor call to B class constructor as it takes  B(Runnable r)
		h.start();             // if class A does not extends Thread then we will get compilation error, and read also the
	}                          // these below lines their clearly explain the relation between Runnable --Thread
}
/* in copy their is a diagram for the   ( Runnable Super Interface   and Thread class implements Runnable Interface) so as
   the Thread class implements Runnable Interface so  as B class constructor will take a 
   argument as     public B (Runnable r){ } 
   
    in the main method()  we are sending  Thread instance as argumnet to B class constructor
    so it is valid because   class Thread implements Runnable 
    
 
 
 
 


*/