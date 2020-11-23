package app_2_67;

import java.util.Arrays;
import java.util.List;

class Employee{
	private String name;
	private double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
}
public class Test {
	public static void main(String[] args) {

		List<Employee> emp1 =  Arrays.asList( new Employee("aa",100),
		                             	   new Employee("bb",200),
				                           new Employee("cc",300)
				                             );
		emp1.forEach(e -> e.setSalary(e.getSalary() +(e.getSalary() * .20)));    // first .forEach();
		  
		emp1.forEach(System.out::println);                                      // second forEach();
	}

}// see in copy easy to understand.   
// point 2:   we are using List<Eomployee>   the changes we are doing in first .forEach() 
// will be reflected back to List.
