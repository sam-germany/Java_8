package app_5_28;

import java.util.TreeSet;

class Person implements Comparable<Person>{
//	private static int count = 0;
//	private String id = "0";
	private String interest;
	
	public Person(String interest) {
		this.interest = interest;
		//this.id = ""  +   ++count;
	}
    public String getInterest() {
    	return interest;
    }
    public void setInterest(String interest) {
    	this.interest = interest;
    }
    
    @Override
    	public int compareTo(Person o) {
    		return o.interest.compareTo(o.interest);
    	}
   public String toString() {
    	return  interest;
    }
}
public class Test {

	String name = "MATH";
	TreeSet<Person> s = new TreeSet<Person>();   // main point as we are using TreeSet<Person>  so the Person class  
	                                             // must implement Comparable/ Comparator  then only the TreeMap<>
	public void add_1(Person p ) {                 //  will work, in our code hier 
		if(name.equals(p.getInterest()))          // class Person implements Comparable<Person>
			s.add(p);                             // then  int compareTo() method will be called internally by TreeSet<>
	
		System.out.println(s+"----------");
	}
	
	public static void main(String[] args) {

	Test t = new Test();
	t.add_1(new Person("MATH"));
	System.out.println("A");
	
	t.add_1(new Person("MATH"));
	System.out.println("B");
	
	System.out.println(t.s);
	
	
	
	}

}
