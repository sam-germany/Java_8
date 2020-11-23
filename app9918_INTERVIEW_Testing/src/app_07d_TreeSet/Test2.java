package app_07d_TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

//if we use TreeSet()  then we have use Comparable/Comparator

class Employee1 implements Comparable{

	public String name;
	
	@Override
	public int compareTo(Object o) {
		return 0;                           // i want to use .compareTo.name but not allowwed
	}
    
	@Override
	public String toString() {
		return name;
	}
	
}
public class Test2 {
	public static void main(String[] args) {

		Employee1 e1 = new Employee1();
		Employee1 e2 = new Employee1();
		
		e1.name = "Sunny";
		e2.name = "Bunny";
		
		Set ts  = new TreeSet();
		ts.add(e1);
		ts.add(e2);                  // as according to compareTo() both objects are equal
		                             // so "Bunny"  will not be add or replaced with "Sunny"
		
		Iterator it  = ts.iterator();
		 while(it.hasNext()) {
                   System.out.println(it.next());       
		 }
        		     
		
		
		
	}

}
