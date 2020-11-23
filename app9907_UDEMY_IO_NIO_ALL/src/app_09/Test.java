package app_09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	private String name;
	private int age;

	public Student(String name, int age) {
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
public class Test {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		  Student st  = new Student("aaa",20);
		
		  try( ObjectOutputStream oos 
				        = new ObjectOutputStream( new FileOutputStream("D:\\Extra_Space_For_FOS_2\\udemy1.dat1") )){ 
		                                                                                      oos.writeObject(st);
		                                                                                                     }
              		
		  try(ObjectInputStream ois
				        = new ObjectInputStream( new FileInputStream("D:\\Extra_Space_For_FOS_2\\udemy1.dat1"))){
                                                                             st = (Student)ois.readObject();			  
		                                                     System.out.printf("%s  %d",  st.getName(),st.getAge());      
	                                                                                        	  }

	}}// if  file is not their  the   new FileOutputStream()  will create a new file their and if it is ther then it
//         overwrite it and create a new.
// Note:   FileOutputStream()  these are Stream so they use bytes for reading and writing , so when 
 //    we open on the above udemy1.dat   file  then we see the data is not readable 

// new FileOutputStream  and  FileInputStream     throws FileNotFoundException
//   .writeObject()  thows  IOException
//    .readObject()  throws  ClassNotFoundException