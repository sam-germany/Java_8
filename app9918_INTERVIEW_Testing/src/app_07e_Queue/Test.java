package app_07e_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Test {

	public static void main(String[] args) {

		Queue q1 = new LinkedList();
		
		q1.add("bb");
		q1.add("aa");
		q1.add(11);
		
		m1(q1);
	}

	public static void m1(Queue q) {
          q.add(new Integer(2222));
          
		while(!q.isEmpty()) {   //  !q.isEmpty();   means Queue has somthing   return true
		System.out.println(q.poll()+" ");
                       }
	
                                   }
}
// this code show as in List we can add Heterogeneous objects.