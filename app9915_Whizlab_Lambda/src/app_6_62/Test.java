package app_6_62;

import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {

		char[] c1 = new char[4];
		
		c1[0] = 2;
		c1[1] = 2;
		
		String s1 = "987654321";
		
		s1.getChars(1, 3, c1, 1);
		
		for(char c2 : c1)
		
			System.out.println(c2);
		
		
	}

}
