package app_1_41;

public class Test implements Runnable{

	 String msg ="default1";
	 

	 public Test (String s) {
	    	 msg = s;
	 }
	 
	@Override
	public void run() {
        System.out.println(msg);
		
	}
	
	public static void main(String[] args) {

		
	   new Thread(new Test("String-1 ")).run();	
	   new Thread(new Test("String-2 ")).run();
	
       System.out.println("end");
}}
