package app_2_14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

class Person {
	String name;
	Integer dob;                         // we must use Integer , otherwise      return p1.dob.compareTo(p2.dob); 
                                            // because all wrapper classes implements by-defaule Comparable Interface 
	public Person(String name, int dob) {     
		this.name = name;
		this.dob = dob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class MySorter {
	public int compare1(Person p1, Person p2) {      // we can define our own  .compareTo()  method
		return p2.name.compareTo(p1.name);
	}
}

public class Test {
	public static int diff(Person p1, Person p2) {
		return p1.dob.compareTo(p2.dob);
	}

	public static int diff(Date d1, Date d2) {
		return d2.compareTo(d1);
	}

	public static void main(String[] args) {

		ArrayList<Person> al = new ArrayList<>();
		al.add(new Person("paul", 25));
		al.add(new Person("aeter", 15));
		al.add(new Person("Patrick", 30));

		Collections.sort(al, Test::diff);  // it will check only the 2 diff method defined in the 
                                           //  Test class
		for (Person x : al) {              //   Note:  as we define static int deff()  as the method is static
			System.out.println(x.getName()); // because  ArrayList<Person>    <Person> we defined so we must define this
		}                                        // .diff() method as static but if we define ArrayList<Test> then as this
		System.out.println("================");     //.diff() method defined in the Test class so no need to define it static


		Collections.sort(al, new MySorter()::compare1);  //  as we are in the Test class, so no-args Constructor of MySorter
		for (Person x : al) {                            //  class also  must be called so we have to call it like this
			System.out.println(x.getName());             // and on that no-args constructor call we are calling .compare1() 
		}                                                //                                                           method.

		System.out.println("++++++++++++++++");
	
		
		Collections.sort(al, (p1, p2) -> p1.dob.compareTo(p2.dob));   // it will check only the compareTo() 
                                                                  // define in this lambda expression
		for (Person x : al) {
			System.out.println(x.getName());
		}
	
		System.out.println("------------------------------------------------");
		
		
		Collections.sort(al, (p1, p2) -> Integer.compare(p2.dob,  p1.dob));
		
		for (Person x : al) {
			System.out.println(x.getName());
		}
	
	}

}
