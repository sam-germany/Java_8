package whiz_2_24;

import java.util.ArrayDeque;

public class Test {

	public static void main(String[] args) {

		ArrayDeque<Integer> q = new ArrayDeque<>();
		
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		
		System.out.println(q.element()+ q.poll());
  //                            10	  +  10         = 20 output
		
		
	}

}
