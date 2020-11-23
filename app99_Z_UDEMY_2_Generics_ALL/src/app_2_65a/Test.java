package app_2_65a;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Student implements Comparator<Student>{
	private String name;
	private Integer age;                         //  if we use   int age;   then we will get error with the 
	                                             //      return o2.age.compareTo(o1.age);
   public Student() {                              
	   super();
   }

      public Student(String name, int age) {
          	this.name = name;
	        this.age = age;
}

      public int compare(Student o1, Student o2) {
      	return o2.age.compareTo(o1.age);             // with int age;   it give us compilation error so we must use
 }                                                   // Integer age; 

      @Override
      public String toString() {
	    return "Student [name=" + name + ", age=" + age + "]";
}}
public class Test {
	public static void main(String[] args) {

		 Student s1 = new Student ("bb",22);
		 Student s2 = new Student ("aa",11);
		 Student s3 = new Student ("cc",33);
		
		 List<Student> l = Arrays.asList(s1,s2,s3);
		 l.sort(new Student());             //  List.sort(comparator)  method take comparator and hier we pass
		 l.forEach(System.out::println);   //  a object that implements Comprator
		 
		 
		 
	}

}
