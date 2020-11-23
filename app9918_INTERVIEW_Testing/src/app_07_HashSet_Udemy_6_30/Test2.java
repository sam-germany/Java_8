package app_07_HashSet_Udemy_6_30;

import java.util.HashSet;
import java.util.Set;


class Student {
    private String name;
    private Integer age;
 
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
    public int hashCode() {
     
    	System.out.println(name.hashCode()+"---");
    	System.out.println(age.hashCode()+"===");        // we can not invoke .hashCode() on premitives like int
    	                                           // but on wrapper as i change hier then we can invoke  
    	System.out.println(name.hashCode() + age+"..");
    	
    	return name.hashCode() + age;

     
    }
    
 
    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }
 
    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student stud = (Student)obj;
            return this.name.equals(stud.name) && this.age == stud.age;
        }
        return false;
    }
}
                                                      // in this example for understanding i change 
public class Test2 {                                  // from new TreeSet<>();   to new HashSet<>();
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        students.add(new Student("James", 20));      // need to understand hashCode()  how it generate
        students.add(new Student("James", 20));      // as we have name= "James"  we call 20 times for this
        students.add(new Student("xxxx", 22));      // name="James" from different objects then everytime
                                                    // same hashCode will be generated and returned
        System.out.println(students.size());        // for name="xxxx" as we pass a different characters
    }                                              // so a different hashcode will be generated
}