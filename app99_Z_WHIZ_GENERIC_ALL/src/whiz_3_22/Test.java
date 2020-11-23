package whiz_3_22;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {

		NavigableMap n = new TreeMap<>();    //   subMap()  is defined int NavigableMap
		n.put(9, 1);                         // if we   use    Map   then we get compilation error 
		n.put(7, 3);
		n.put(8, 2);
		n.put(6, 5);
		
		System.out.println(n.subMap(7,true,8, false).values());
		
		System.out.println(n.subMap(7,true,9, false).values());
		
		System.out.println(n.subMap(6,true,9, false).values());
	
	
//    .subMap()  method defined in NavigableMap   but not in  Map		
//		n.subMap(fromKey, toKey);    we can put bollean for inclusive or exclusive
	
	}

}   
