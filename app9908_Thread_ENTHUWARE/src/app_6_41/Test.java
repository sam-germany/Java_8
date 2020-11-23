package app_6_41;

public class Test extends Thread{
	
	private static int  counter = 0;
	
	public synchronized void run() {
		 
		counter++;
		System.out.println(counter);
	}

	public static void main(String[] args) {

		          
		for(int i = 0; i<5;i++) {
			
			new Test().start();
		}
		
		
		System.out.println(counter   +"---DONE----");
		
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