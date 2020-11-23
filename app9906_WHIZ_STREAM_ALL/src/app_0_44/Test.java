package app_0_44;

import java.util.stream.Stream;

class Student{
	private String name;
	
	public Student(String n) {
		name = n;
	}
	
	public String getName() {
		return name;
	}
	
	
}
public class Test {
	public static void main(String[] args) {

		Stream<Student> s1 = Stream.of(
				                   new Student("aaa"),
				                   new Student("bbb"),
				                   new Student("ccc")
				                     ); 
		
		Stream<String> s2 = s1.map(s -> s.getName());
 		
	                  s2.forEach(System.out::println);

	                  
	//       .mapToString()  their is no method in Stream class as  .mapToString()          
	}

}
