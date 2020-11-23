package app_4_27;

import java.util.HashSet;

enum SIZE{
	TALL, GRANDE, JUMO;
}

public class Test {
	public static void main(String[] args) {

		HashSet<SIZE> hs = new HashSet<>();
		
		hs.add(SIZE.TALL);
		hs.add(SIZE.JUMO);
		hs.add(SIZE.GRANDE);
		hs.add(SIZE.TALL);
		hs.add(SIZE.TALL);
		hs.add(SIZE.JUMO);
		
		for(SIZE x : hs) {
			
			System.out.println(x);
		}
		
		
	}

}
