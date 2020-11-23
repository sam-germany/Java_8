package app_5_2;

interface Boiler{

	public void boil();
	
	public static void s1() {
		System.out.println("shutting down");
	}
}

interface Vaporizer extends Boiler{
	
	public default void v1() {
		   boil();
		System.out.println("vaporized");
	}
}

public class Test implements Vaporizer {
   
	public void boil() {
		System.out.println("Boiling..........");
	}
	
	public static void main(String[] args) {

		Vaporizer v = new Test();
		v.v1();
		Boiler.s1();
		
		
	}

}
