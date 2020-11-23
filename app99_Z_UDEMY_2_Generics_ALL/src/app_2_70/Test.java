package app_2_70;

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
                       .filter(x -> x.getSalary() > 10000)
                       .map(e -> e.getName())
                       .forEach(System.out::println);

    }}

/*
 * as we put in .map(e.getName())   so this is the reason in the output we get only the   Names as output.
 * 
 * 
 * 
 * 
 */















