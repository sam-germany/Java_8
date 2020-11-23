package app_5_29;

import java.util.LinkedList;
import java.util.Queue;

class Person{
	private String name;

	public Person(String name) {
		this.name= name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
}
public class Test {
  
	public void helpPeople(Queue q1, Queue q2) {
		do {
			 Person p = (Person)q1.poll();       // .poll();  it delete and return the  first object from front
			 System.out.println("people=== "+ p );
		  	 q2.offer(p.getName());            // hier we are again inserting from back the deleted object

		    System.out.println("helped=== "+ q2 );
			
		}while(!q1.isEmpty());   // means   people is not empty  == true
 	}                                // means   people is empty  == false      after both obj  people is empty
	                                  //                                      compiler come out of loop
	public static void main(String[] args) {


		Queue<Person> p = new LinkedList<>();
		p.offer(new Person("Pope"));
		p.offer(new Person("John"));
		
		Queue<Person> h = new LinkedList<>();   // we created 2 LinkedList   p and h 
		                                         
		                                       // data of  "p"  we are putting into   "h"  
		Test t = new Test();
		t.helpPeople(p,h);
		
		
		
		
	}

}
