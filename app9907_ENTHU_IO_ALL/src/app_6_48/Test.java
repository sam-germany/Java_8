package app_6_48;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Boo{
	int boo = 10;
	public Boo(int k) {
		System.out.println("In Boo K = "+ k);
		boo = k;
	}
	public Boo() {};
}
class BooBoo extends Boo {  // just play hier little by putting  implements Serializable
	public BooBoo(int k) {
		super(k);
		System.out.println("In BooBoo k = " + k );
	}
		public BooBoo() {
	super();
		}
	}
class Moo extends BooBoo implements Serializable {
	int moo = 10;
	public Moo() {
		super(5);
		System.out.println("In Moo");
	}
}
public class Test {
	public static void main(String[] args) throws Exception {

		Moo moo = new Moo();
		
		FileOutputStream fos = new FileOutputStream("D:\\Extra_Space_For_FOS_2\\rr\\99b.TXT");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		
		os.writeObject(moo);
		os.close();
		
		System.out.println("-------------");
		
		FileInputStream fis = new FileInputStream("D:\\Extra_Space_For_FOS_2\\rr\\99b.TXT");
		ObjectInputStream is = new ObjectInputStream(fis);
		
		moo = (Moo)is.readObject();
		is.close();
		
		
		
	}
// Note: we create a object of Moo class, so at the time of 
}
