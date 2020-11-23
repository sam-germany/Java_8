package app_2_75;

import java.util.Arrays;
import java.util.List;

class Employee {
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
 
    public void setSalary(double salary) {
        this.salary = salary;
    }
 
    public String toString() {
        return "{" + name + ", " + salary + "}";
    }
}
 
public class Test {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(new Employee("Jack", 10000), 
                                                 new Employee("Lucy", 12000));

        
        employees.stream()
                 .peek(e -> e.setSalary(e.getSalary() + 555))
                 .forEach(System.out::println);
    
        System.out.println(employees);
        
    
 // the main point is that eventhough we are using .peek() method the changes we done in this mehtod
 //  they are reflecting back to the List.
    
    
    
    
    
    
    }
}