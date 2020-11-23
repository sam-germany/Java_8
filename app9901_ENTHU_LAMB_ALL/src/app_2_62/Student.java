package app_2_62;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
	
	public static enum Grade{   A,B,C,D,F }
	
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
	
	@Override
	public String toString() {
		return name +" "+grade;
	}
	public static void main(String[] args) {

		 List<Student> l = Arrays.asList(new Student("aa",Student.Grade.A),
			                           	 new Student("aa",Student.Grade.A),
				                         new Student("aa",Student.Grade.A),
				                         new Student("aa",Student.Grade.A)
				                        );

		 Map<Student.Grade, List<Student>> group = l.stream().collect(Collectors.groupingBy(x -> x.getGrade()));
		                                                                                // (Test::getGrade)
		 
		 
		 
				 
				 
		
	}

}
