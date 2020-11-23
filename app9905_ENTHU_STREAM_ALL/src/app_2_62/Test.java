package app_2_62;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student{
	public static enum Grade{ A, B, C, D, E, F}
	
	private String name;
	private Grade grade;
	public Student(String name, Grade grade) {
		this.name = name;
		this.grade = grade;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Grade getGrade() {
		return grade;
	}
	public void setGrade(Grade grade) {
		this.grade = grade;
	}
	
	public String toString() {
		return name +" "+ grade;
	}
}
public class Test {

	public static void main(String[] args) {

		List<Student> ls = Arrays.asList(
				                         new Student("S1", Student.Grade.A),
				                         new Student("S2", Student.Grade.A),
				                         new Student("S3", Student.Grade.B),
				                         new Student("S4", Student.Grade.B),
				                         new Student("S5", Student.Grade.C)
				                         ); 
		
		Map<Student.Grade, List<Student>> grouping = ls.stream().collect(Collectors.groupingBy(s -> s.getGrade()));
		
		System.out.println(grouping);
		
	}

}
