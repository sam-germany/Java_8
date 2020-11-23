package app_10c_IO;

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
class Student1 implements Serializable {
    private transient String name;
    private int age;
 
    Student1(String name, int age) {
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
 
public class Test2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student1 stud = new Student1("John", 20);
        
        try( ObjectOutputStream oos
        		= new ObjectOutputStream( new FileOutputStream("D:\\Extra_Space_For_FOS\\Student.dat")) ){
                                                                                          oos.writeObject(stud);
                                                                                           }
 
        try( ObjectInputStream ois
        		= new ObjectInputStream(   new FileInputStream("D:\\Extra_Space_For_FOS\\Student.dat")) ){
                                                                                     stud = (Student1)ois.readObject();
                                                          System.out.printf("%s : %d", stud.getName(), stud.getAge());
        }
    }//  as shown hier clearly that while writing a object  transient will not be effected but at the time of 
    // reading   de-serizable will be effected and transient fields will be skipped
}