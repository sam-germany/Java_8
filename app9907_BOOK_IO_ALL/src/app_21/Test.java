package app_21;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Student implements Serializable{ }

public class Test  implements Serializable{
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{

		try(ObjectInputStream ios = new ObjectInputStream( new FileInputStream("D:\\Extra_Space_For_FOS_2\\dd1")))
		{
			Student record;
			
			while((record = (Student)ios.readObject()) != null) {
				                       System.out.println(record);
			                                          }
		}catch(EOFException e ) {
		}catch(Exception e) {
			throw new RuntimeException();
		}
	}

}
