package app_61;

import java.util.OptionalDouble;

class MyException1 extends Exception{
	
}

public class Test {
	public static void main(String[] args) {

		OptionalDouble op = OptionalDouble.empty();
		
		try {
			
			System.out.println(op.orElseThrow( MyException1::new ));
		
		} catch (MyException1 e) {
			e.printStackTrace();
		}
		
		
	}

}
