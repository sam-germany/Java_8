package app_07f_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
	
	String name;
	int age;
	
	public Employee(String name, int age) {
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
public class Test2 {
	public static void main(String[] args) {

		List<Employee> emp = new ArrayList<>();
        
	  Employee emp1  = new Employee("aa",22);		
	  Employee emp2  = new Employee("aa",11);
	  Employee emp3  = new Employee("cc",01);
	  emp.add(emp1);
	  emp.add(emp2);
	  emp.add(emp3);

	  Collections.sort(emp, new Comparator<Employee>() {

		                       @Override
	      	                   public int compare(Employee o1, Employee o2) {

		                    	   if(o1.name.compareTo(o2.name)== 0) {
		                    		   return o1.age - o2.age;
		                    	   
		                    	   }else {
                                         return o1.name.compareTo(o2.name);		                    		   
 		                    	          }
		                    	                                           }
                	   });
	  
	 for(Employee x : emp) {
		 System.out.println(x.name+" "+x.age);
	 }
	}
}
