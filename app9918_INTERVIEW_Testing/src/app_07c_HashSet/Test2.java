package app_07c_HashSet;

import java.util.HashSet;

class Employee1{
	public String name;
	
	
	@Override
	public int hashCode() {
		return 31;
	}
}
public class Test2 {
	public static void main(String[] args) {

		Employee1 emp1 = new Employee1();
		Employee1 emp2 = new Employee1();
		emp1.name = "John";
		emp2.name = "John";
		
		HashSet hs = new HashSet();   // hier even both obj are same but it add 2 objects
		hs.add(emp1);                  // because for hashSet() we must write both 
		hs.add(emp2);                  // equals()  and hashCode()   methods.
		
		System.out.println(hs.size());
		
		
		
	}

}
