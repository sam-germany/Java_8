package app_5_82;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String>  l = new ArrayList<>();
		
		l.add("a");
		
		l.remove(0);
		l.remove(0);   // this line will throw  IndexOutOfBoundsException  as no argument is on 0_th index.
		
		
	}

}
