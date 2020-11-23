package app_2_58;

import java.util.TreeSet;

enum SIZE{

	TALL, JUMBO, GRANDE;
	
}
public class Test {

	public static void main(String[] args) {
		
   TreeSet<SIZE> hs  = new TreeSet<SIZE>();
		hs.add(SIZE.TALL);
		hs.add(SIZE.JUMBO);
		hs.add(SIZE.GRANDE);
		
		for(SIZE s: hs) {
			System.out.println(s);
		}
		
	
	}
}
