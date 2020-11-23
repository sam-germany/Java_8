package app_5_53;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.w3c.dom.ls.LSException;

import app_5_53.Student.Grade;

class Student {
	public static enum Grade {
		A, B, C, D, F
	};

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
		return name +" "+grade;
	}
}
	public class Test {
	public static void main(String[] args) {

		List<Student> ls = Arrays.asList(
				                        new Student("S1", Student.Grade.A),
				                        new Student("S2", Student.Grade.A),
				                        new Student("S3", Student.Grade.C)
				                          );
		
		Map<Grade, List<Student>> grouping1   = ls.stream()
				                                  .collect(Collectors.groupingBy(Student::getGrade));
		System.out.println(grouping1);

		
		System.out.println("---------------------------------------------");
		
		
//        Map<Grade>  or Map<Student.Grade> both are same
		Map<Student.Grade, List<String>> grouping2   
		                           = ls.stream()
				                       .collect(Collectors.groupingBy(Student::getGrade,
				                                Collectors.mapping(Student::getName, Collectors.toList())));
	 //                        .mapping() method   in it        .getName()  should be mapped and as List type
	//                     Note: in mapping() method we must privide the field and Type for that field	
	//                             if we only provide the field and not Type then compilation error	
		System.out.println(grouping2);
	
		
		System.out.println("--------------------------------------------------");
		
		Map<Student.Grade, List<Grade>> grouping3 
		                             = ls.stream()
		                                 .collect(Collectors.groupingBy(Student::getGrade,
                                                  Collectors.mapping(Student::getGrade, Collectors.toList()))
                                                   );
         System.out.println(grouping3);
	
	System.out.println("-----------------------------------------------");
	
	Map<Student.Grade, Map<String, List<Student>>> grouping4 
	                                   = ls.stream()
	                                       .collect(Collectors.groupingBy(Student::getGrade,
			                                       Collectors.groupingBy(Student::getName, Collectors.toList()))
			                                        ); 
	                 System.out.println(grouping4);

}}
