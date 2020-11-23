package app_2_23;

interface A{
	default void hello11() {
	}
}

interface B extends A{
	default void hello22() {
		
		A.super.hello11();
	}
}
public class Test implements B{

	public void hello() {
		
		B.super.hello22();
	}
	
	public static void main(String[] args) {
	
		
	
	
	
	}
}
