package app_6_41;

public class Test2 extends Thread{
	
	
	public synchronized void run() {
		
		int  counter = 0;              // as i tried to put     static int counter=0;  in   synchronized 
		counter++;                     // using static variable in non static method not allwoeed
		System.out.println(counter);
	}                                       // public static synchronized void run() {}
                                               // we can not define static  the @Overriden run() method
	public static void main(String[] args) {

		          
		for(int i = 0; i<5;i++) {
			
			new Test2().start();
		}
		
		
		System.out.println(  "---DONE----");
		
	}}

/*
2
2
3
3---DONE----
4
5

this can be a possible output. it is same example as we jave till now.  
that we have a gap between  static int counter=0;   and syso(..);   eventhough   counter+++;  is in 
a synchronized method  but still  


*/