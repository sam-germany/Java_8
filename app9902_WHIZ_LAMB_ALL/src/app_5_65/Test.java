package app_5_65;

import java.util.function.IntSupplier;

public class Test {

	public static  int get1(IntSupplier t) {
		return t.getAsInt();
	}
	
	
	public static void main(String[] args) {

		IntSupplier in  = ()-> Integer.compare(1, 2);
		
		System.out.println(get1(in));
		
	}
	
	

}
