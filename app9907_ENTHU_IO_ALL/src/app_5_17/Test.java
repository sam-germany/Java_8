package app_5_17;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Boo implements Serializable{
	transient int ti = 10;
	static int si = 20;
	
}
public class Test {
	public static void main(String[] args) throws Exception {

		Boo b1 = new Boo();
		b1.si++;

		System.out.println(b1.ti +" "+ b1.si);
		
		FileOutputStream fos = new FileOutputStream("D:\\Extra_Space_For_FOS_2\\dd\\aa\\test3.txt");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		
		os.writeObject(b1);
		os.close();

		FileInputStream fis = new FileInputStream("D:\\Extra_Space_For_FOS_2\\dd\\aa\\test3.txt");
		ObjectInputStream is = new ObjectInputStream(fis);
		
		Boo b2 = (Boo)is.readObject();
	
		System.out.println(b2.ti +" "+b2.si);
		
		is.close();
	}

}
