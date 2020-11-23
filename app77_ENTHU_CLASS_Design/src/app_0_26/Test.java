package app_0_26;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {

	public static void main(String[] args) {

		Deque<Integer> d = new ArrayDeque<>();
		d.add(1);
		d.push(2);
		d.pop();
		d.offerFirst(3);
		d.remove();
		System.out.println(d);
	
	}
	

}
