package app_2_65;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student implements Comparator<Student>{
	private String name;
	private String exam;

   public Student() {
	   super();
   }
      public Student(String name, String exam) {
          	this.name = name;
	        this.exam = exam;
}

      public int compare(Student o1, Student o2) {
      	return o2.name.compareToIgnoreCase(o1.name);
 }

      @Override
      public String toString() {
	    return "Student [name=" + name + ", exam=" + exam + "]";
}}
public class Test {
	public static void main(String[] args) {

		 Student s2 = new Student ("bb","22");
		 Student s3 = new Student ("cc","33");
		 Student s1 = new Student("aa","11");
		 
		 List<Student> l = Arrays.asList(s1,s2,s3);
		 l.sort(new Student());             //  List.sort(comparator)  method take comparator and hier we pass
		 l.forEach(System.out::println);   //  a object that implements Comprator
		 
		 
		 
	}

}
