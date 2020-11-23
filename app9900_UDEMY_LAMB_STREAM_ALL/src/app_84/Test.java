package app_84;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Person{
	int id;
	String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return id +" "+name;
	}
	/*		
	@Override
	public boolean equals(Object obj) {
	     if(obj instanceof Person) {
		   Person p = (Person)obj;	
		   
		   return this.id == p.id; 
	     }
      return false;
	}

	@Override
	public int hashCode() {
		return new Integer(this.id).hashCode();
	}
	*/
}
public class Test {
	public static void main(String[] args) {
    
		 Person p1 = new Person(1010,"sean");
		 Person p2 = new Person(2854,"Rob");
		 Person p3 = new Person(1111, "Lucy");
		 
		 Stream<Person> s = Stream.of(p1,p2,p3);
         
		 
	//	 Map<Integer, Person> map = s.collect( Collectors.toMap(p -> p.id, p -> p ));
	//	 System.out.println(map);
		 
		 Map<Integer, Person> map1 = s.collect(Collectors.toMap(p -> p.id, Function.identity()));
		 System.out.println(map1);
		
//		 Map<Integer, Person> map2 = s.collect(Collectors.toMap(TreeMap::new));
//		 System.out.println(map2);
//                                this will not work because TreeMap   does not come in Collections		 
		
	}

}
