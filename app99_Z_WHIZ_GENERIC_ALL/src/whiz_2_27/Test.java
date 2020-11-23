package whiz_2_27;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {

	static class Person{
		 String name;
		 int age;
		 
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		 
		@Override
		public String toString() {
			return name;
		}
	}
	public static void main(String[] args) {

		List<Person> l = new ArrayList<>();
		
		l.add(new Person("bb",22));
		l.add(new Person("cc",33));
		l.add(new Person("aa",11));
		l.add(new Person("dd",44));
		
		l.sort(Comparator.comparing(Person::getAge));    //main point is in this  .sort() method  we put only Comparator
		                                                 // till now in the old examples we use 
		System.out.println(l);                          // Collections.sort(list, comparator);
		
		
		
		
		
		
		
		
	}

}
