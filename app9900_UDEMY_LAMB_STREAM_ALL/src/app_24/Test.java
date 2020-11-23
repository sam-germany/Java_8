package app_24;

import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.function.BiConsumer;

public class Test {

	public static void main(String[] args) {

		NavigableMap<Integer,String> map  = new TreeMap<>();
		
		BiConsumer<Integer,String> con = map::putIfAbsent;
	                       
		con.accept(2, "TWO");
		con.accept(1, null);
		con.accept(2, "one");
		con.accept(1, "one");
		
		
		System.out.println(map);
	
		
	//	BiConsumer<Integer, String> con = (x,y) -> map.putIfAbsent(x, y);
	}}

/*  
    as we know  Consumer  does not return anything back.  so hier also  Consumer only accept and 
    put the enteries in the TreeMap<>()  
    
    just draw in mind how the flow of this code goes, we put first in Consumer after that in TreeMap<>();
 
 
  
  
 */
