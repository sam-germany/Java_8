package app_3_18;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Student {

	private String name;
	private int marks;
	
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
	public void addM1(int m) {
		this.marks += m;
	}
	
	public void  print12() {
		System.out.println(name+ " : "+ marks);
	}
	
	public static void main(String[] args) {

		List<Student> l = Arrays.asList( new Student("s1",35),
				                         new Student("s2",55),
				                         new Student("s2",15)
				                        );
	   Consumer<Student> c1 = s -> s.addM1(6);
	   
	   l.forEach(c1);           // as forEach(consumer)  it takes consumer so hier we add +10 marks
	                                // in all Student objects but till now we do not print
	  
	   l.stream().forEach(Student::print12); // as forEach() takes consumer, so we can pass like this 
	                                         // as show this method print12()  is of void type so 
	}                                        // hier we can use it as consumer



}
