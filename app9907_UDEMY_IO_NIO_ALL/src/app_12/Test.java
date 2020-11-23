package app_12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Counter implements Serializable{
	private static final long serialVersionUID = 1L;
	
	 private  static int count = 0;

	public Counter() {
       count++;
	}

	public static int getCount() {
		return count;
	}
}
public class Test {
	public static void main(String[] args)  throws IOException, ClassNotFoundException{

		Counter ctr =  new Counter();
		
		try( ObjectOutputStream oop 
				  = new ObjectOutputStream(new FileOutputStream("D:\\Extra_Space_For_FOS_2\\count1.dat"))){
			                                                                             oop.writeObject(ctr);
		 } 
		 new Counter();
		 new Counter();
		 
		try( ObjectInputStream ois 
				 = new ObjectInputStream( new FileInputStream("D:\\Extra_Space_For_FOS_2\\count1.dat"))){
			                                                                  ctr =  (Counter)ois.readObject();
			                                                             System.out.println(ctr.getCount());
		                                                                                             }
		
		
		
		
		
	}

}
