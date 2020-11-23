package app_3_29;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
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
	public String toString() {
		return name +" "+marks;
	}
}
public class Test {
	public static void main(String[] args) {

		List<Student> ls = Arrays.asList(
				                   new Student("S1",20),
				                   new Student("S3",30),
				                   new Student("S3",20)
				                         );
		Map<Integer,List<Student>> grouping= ls.stream().collect(Collectors.groupingBy(a ->a.getMarks())); 
		
		System.out.println(grouping);
	}

}
