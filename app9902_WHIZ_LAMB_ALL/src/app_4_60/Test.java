package app_4_60;

import java.util.function.IntSupplier;

public class Test {

	public static int get1() {
		return (int)(Math.random()*10)+1;
	}
	
	
	public static void main(String[] args) {

		IntSupplier ins = Test::get1;
		
		System.out.println(ins.getAsInt());
	}
	
	

}
