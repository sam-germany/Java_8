package app_2_76;

import java.util.Arrays;
import java.util.List;

class Person{
	private String name;
	private int age;
	
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
public class Test {
	public static void main(String[] args) {

		List<Person> l = Arrays.asList( new Person("aa",31),
			                         	new Person("bb",32),
				                        new Person("cc",33),
				                        new Person("dd",34)
				                      );
		double average = l.stream()
				          .filter(f -> f.getAge() < 30)
		                  .mapToInt(f -> f.getAge())
		                  .average()
		          //      .getAsDouble()     as per the condition no person is selected as age is greater then 30
		                  .orElse(0.0);   // .getAsDouble() return the  double premitive , as stream is empty then  
	                                      // then it throws exception
		    
		                           // Note   as  .average() return   OptionalDouble  and in empty Stream case
		                           // we can call  .orElse() method  put somthing so Optional will not 
	System.out.println(average);     // print Optional.Empty
	}

}
