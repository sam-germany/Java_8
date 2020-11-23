package app_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.sql.SQLException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
class Student implements Serializable {
    private static String name;
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
 
    public void setName(String name) {
        this.name = name;
    }
 
    public void setAge(int age) {
        this.age = age;
    }
}
 
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student stud = new Student("John", 20);
        Student stud1 = new Student("Ram", 10);
        
        try( ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("D:\\Extra_Space_For_FOS\\Student.dat")) ){
            oos.writeObject(stud);
            oos.writeObject(stud1);
        }
 
        try( ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("D:\\Extra_Space_For_FOS\\Student.dat")) ){
            stud = (Student)ois.readObject();
            stud1 = (Student)ois.readObject();
            
            System.out.printf("%s : %d", stud.getName(), stud.getAge());
            System.out.printf("%s : %d", stud1.getName(), stud1.getAge());
        }
    }
}