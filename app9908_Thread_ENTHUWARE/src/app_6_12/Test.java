package app_6_12;

class Base extends Thread{
	
	static  int k = 10;  //  static volatile int k = 10;               Read complete  explanation  
}

class Incrementor extends Base{
	
	@Override
	public void run() {
                   for(; k>0; k++) {
                	   System.out.println("I-Running....");
}}}

class Decrementor extends Base{
	
	   @Override
	public void run() {
               for(; k>0; k--) {
            	   System.out.println("D-Running");
}}}
public class Test {
	public static void main(String[] args) {

		Incrementor i = new Incrementor();
		Decrementor d = new Decrementor();
		
		i.start();
		d.start();
		
		
		
		
		
		
	}

}
