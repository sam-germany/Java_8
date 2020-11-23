package app_0_7;

import java.util.Arrays;

enum Value1{

	HIGH(1), MEDIUM(6), LOW(3);
	
	private final int x;
	
	private Value1(int x) {
		this.x = x;
	}
}
public class Test {

	public static void main(String[] args) {

		Value1[] v = {Value1.HIGH, Value1.LOW, Value1.MEDIUM};
		
		
		System.out.println(v[1]);

		Arrays.sort(v); // it will arrange these CONSTANT values to as we defined in the begining
		System.out.println(v[1]);
	}

}
