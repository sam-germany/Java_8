package app_2_30;

import java.util.HashSet;
import java.util.Set;

class Student {
    private String name;
    private int age;
 
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
 
    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }
 
    @Override
    public int hashCode() {                                        /// in this code we are doing 3 checks
    	return  age;                                             //(1) hashCode of 2 equals  object must be same
    }                                                           // (2,3)  in equals() method we check if 2 objects   
                                                                // has same name and age then only they are equal
    public boolean equals(Object obj) {                            
        if(obj instanceof Student) {                              
            Student stud = (Student)obj;
            return this.name.equals(stud.name) && this.age == stud.age;
        }
        return false;
    }
}
 
public class Test {
    public static void main(String[] args) {
    	                                                  // HashSet<> does not allowes duplicate
        Set<Student> students = new HashSet<>();          //in HashSet<>  2 objects are equal when 
        students.add(new Student("James", 20));           //(1) when  boolean equals() method return true
        students.add(new Student("James", 20));           //(2) and when hashCode() method return same hashCode
        students.add(new Student("James", 22));           //                                     for both objects
 
        System.out.println(students.size());
        
        System.out.println(students);
    }}
/*
in app_2_30   we use       Set<Student> students = new HashSet<>(); 
  
  HashSet<>();  for comparision on the basis of     hashCode() and .equals() method  

*/