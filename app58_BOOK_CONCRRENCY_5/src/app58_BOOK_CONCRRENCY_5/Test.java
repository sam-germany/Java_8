package app58_BOOK_CONCRRENCY_5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

	public static void main(String[] args) {

	List<Integer> original  = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
	
	
	List<Integer> copy1 = new CopyOnWriteArrayList<>(original);
	for(Integer x :copy1) {
		copy1.remove(x);
	}
	
	List<Integer> copy2 = Collections.synchronizedList(original);
	for(Integer x :copy2) {
		copy2.remove(x);
	}
	
	
	
	}

}
