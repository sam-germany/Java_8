package app_29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person {
	private String name;
	private int age;
	
	public Person() {}                          // hier is the no-args constructor
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class Student extends Person implements Serializable{
	
	private String course;
	
	public Student(String name, int age, String course) {
		super(name, age);
		this.course = course;
	}
	
	public String getCourse() {
		return course;
	}
}
public class Test {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Student stud = new Student("John", 20, "Science");
		
	  try(  ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Extra_Space_For_FOS\\r1.txt"));
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Extra_Space_For_FOS\\r1.txt"))   )
		   {
		
			oos.writeObject(stud);
			
	    Student stud1 = (Student )ois.readObject();
	    System.out.println(stud1.getName()+" "+stud1.getAge()+" "+stud1.getCourse());
	    
		  }
	}

}
