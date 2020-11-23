package app_6_10;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Test {

	public static void main(String[] args) {

		List<String> l = new CopyOnWriteArrayList<>();
		
		l.add("Melon");
		l.add("Apple");
		l.add("Banana");
		
		for(String s : l) {
			l.removeIf( x -> x.startsWith("A"));
			
			System.out.println(s);
			
		}
		
		System.out.println("--------------");
		
		System.out.println(l);
	}

}/* must draw this in mind.

 trickey question   Note: we are doing   l.removeIf()    in the for() loop  means the changes we
do will be visible on list.
as just remember question app_09 in the CopyOnWriteArrayList  how it is defined their 

(1)  when we create a Iterator  or for Loop it takes a copy of the List and we can iterate on that copy
but  if we do some modifications then  then java create a new Array with all the objects + new changes
these changes will be reflected back to the  List<String> 

but as the Iterate / for loop already have a copy of the Array in the begining these new changes will
not be reflected in this old copy  this is the reason as we are removing , even the object is removed
form the  main List<String>  but in the iterator / for loop   we are still getting that  object


 
 
 

  


*/
