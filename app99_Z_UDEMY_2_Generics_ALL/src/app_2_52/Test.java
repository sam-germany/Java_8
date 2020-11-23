package app_2_52;

import java.util.Set;
import java.util.TreeSet;

class Employee implements Comparable<Employee> {
    private String name;
    private int age;
 
    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
    @Override
    public String toString() {
        return "{" + name + ", " + age + "}";
    }
 
    @Override
    public int compareTo(Employee o) {
        return  this.age - o.age;
    }
}
 
public class Test {
    public static void main(String[] args) {
        Set<Employee> employees = new TreeSet<>();  // as we use TreeSet<>  so need Comparator/Comparable
        employees.add(new Employee("Udayan", 31));
        employees.add(new Employee("Neha", 23));
        employees.add(new Employee("Hou Jian", 42));
        employees.add(new Employee("Smita", 29));
 
        System.out.println(employees);
    }}

/*              return
   obj1 < obj2    (-)     means   obj1  has to come before obj2
   obj1 > obj2    (+)     means   obj1  has to come after obj2
   obj1 == obj2   (0)     means   obj1, obj2  both has to stay at same place  
  
 */






