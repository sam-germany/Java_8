package app_65;
import java.util.stream.Stream;

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

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return name  +" "+ salary;
	}
	
	public static int salaryCompare1(double d1, double d2) {
		return new Double(d2).compareTo(d1);
	}
	
	//public static int compare(Employee e1, Employee e2) {
	//	return e2.getSalary().
	//}
}
public class Test {
	public static void main(String[] args) {

		Stream<Employee> employee = Stream.of(new Employee("Jack",1000),
				                              new Employee("Lucky",12000),                               
				                              new Employee("Bunny",7000)
                               				);
	
	       highestSalary1(employee);
	}

	 private static void highestSalary1(Stream<Employee> emp) {
		 System.out.println(emp.map( x -> x.getSalary())
				               .max(Employee::salaryCompare1)                  
           				 );
	 }
	
}