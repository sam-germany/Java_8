package whiz_5_24;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List l = new ArrayList<>();
		
		l.add(new Integer(10));
		l.add(new Integer(20));
		l.add(new Integer(25));
		
 //		l.removeIf(x -> x%2 !=0);   //  as we do not define  List<Integer>   so it means we are defining that all 
		                            // elements are objects, after that   l.removeIf(x -> x%2 !=0);  we are   
		System.out.println(l);      // using % operator on  object cause compilation error.
		
		
		
	}

}
