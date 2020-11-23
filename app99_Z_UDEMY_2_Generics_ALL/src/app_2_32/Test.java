package app_2_32;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


class Student {
    private String name;
    private int age;
 
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
    	return name;
    	}
    
    public int getAge() {
    	return age;
    	}
 
  //  public int hashCode() {
 //       return name.hashCode() + age;
  //  }
 
    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }
 
/*    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student stud = (Student)obj;
            return this.name.equals(stud.name) && this.age == stud.age;
        }
        return false;
    }
 */
    public static  int compareByName(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}                                                                      //very Important in this case Set is different as List
public class Test {                                                    // if List<Student>   List is of Student type then
    public static void main(String[] args) {                           // as in this code  .compareByName() method must not
        Set<Student> students = new TreeSet<>(Student::compareByName); // be a static method we can call it  (Student::compareByName)
        students.add(new Student("James", 20));                          
        students.add(new Student("James", 20));                       // but in Set it is not like so even Set<Student> Set is of 
        students.add(new Student("James", 22));                       // Student type but for calling (Student::compareByName)
                                                                      // the .comparebyNyme() method must be static.
        System.out.println(students.size());
        
        System.out.println(students);
    }}
/*
 in app_2_30   we use       Set<Student> students = new HashSet<>(); 
  
  HashSet<>();  for comparision on the basis of     hashCode() and .equals() method  
  ----------------------------------------------------------------------------------------
  
 in this code app_2_32       Set<Student> students = new TreeSet<>(Student::compareByName);
 
 in this code we defined   .hashCode()  and .equals()  method but   TreeSet<>();  use for  comparing
 comparator   so  these both method does not used by TreeSet<>();   
 
  as  in this code i hide both .hashCode()  and .equals()  but still the output is same. it shows that
  TreeSet<>( Comparator );  use only Comparator. for comparision.
  
   
   for testing just remove the comments from the both method. still the output is same
 
 //Note TreeSet<>   need a Comparator/ Comparable for comparing as we get the sorted output.
  
   String class implements by-default  comparable interface.  so we can directly use 
   .compareTo() method on the  String name;  
  
  
  
 */




