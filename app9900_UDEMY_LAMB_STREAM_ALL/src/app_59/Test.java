package app_59;

import java.util.OptionalLong;

public class Test {

	public static void main(String[] args) {
		
    OptionalLong   op = OptionalLong.of(111);  // if we put value then it wil not throw exception
    
    System.out.println(op.isPresent()+"  "+op.getAsLong());
		
	}

}
