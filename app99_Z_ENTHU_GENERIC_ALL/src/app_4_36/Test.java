package app_4_36;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person{
	String name;
	String dob;
	
	public Person(String name, String dob) {
		this.name = name;
		this.dob = dob;
	}
}
public class Test {

	public static void main(String[] args) {

		ArrayList<Person> al = new ArrayList<>();
		
		al.add(new Person("paul", "111"));
		al.add(new Person("amrit","222"));
		al.add(new Person("karan","322"));
		al.add(new Person("sss","444"));
		
		Collections.sort(al, new Comparator<Person>() {
		                                          	@Override
		                                  	        public int compare(Person o1, Person o2) {
				                                    return o2.dob.compareTo(o1.dob);
			                                             }
		                                             });
		for(Person a :al) {
			System.out.println(a.name+" "+a.dob);
		}
		
		
		System.out.println("-------------------");
		
        Collections.sort(al, (s1,s2) -> s1.dob.compareTo(s2.dob));
        
        for(Person a :al) {
			System.out.println(a.name+" "+a.dob);
		}
	}

}
