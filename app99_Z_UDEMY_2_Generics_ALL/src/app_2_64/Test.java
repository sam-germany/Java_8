package app_2_64;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Person{
	private String firstName;
	private String lastName;
	
	public  Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Perosn [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
public class Test {
	public static void main(String[] args) {
    
		List<Person> l = Arrays.asList(  new  Person("aa","11"),
			                             new  Person("cc","33"),
				                         new  Person("bb","22")
				                       );
		         l.stream()
		                  .sorted(Comparator.comparing(Person::getFirstName))  //  as  List<Person>  is of <Person> type
		                  .forEach(System.out::println);                      // so we can call non-static methods also like
		                                                                        // this  (Person::getFirstName)
                System.out.println("---------------------------");
                
		         
                l.stream()
                         .sorted( Comparator.comparing(Person::getFirstName)
                        		            .reversed()
                                            .thenComparing(Person::getLastName)
                                 )
                         .forEach(System.out::println);
		
                
		         
		         System.out.println("---------------------------");
                l.stream().forEach(System.out::println);     
	}

}
