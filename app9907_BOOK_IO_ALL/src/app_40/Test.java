package app_40;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test implements Serializable{

	private int chambers = -1;
	private transient Double  size = null;
	private static String color;
	
	public Test() {
		this.chambers= 3;
		color= "Blue";
	}
	
	public static void main(String[] args)  throws Exception{
		
  try( ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Extra_Space_For_FOS_2\\scan.txt"))){
			                           Test t = new Test();
			                           t.chambers = 2;
			                           t.size = 10.0;
			                           t.color  = "RED";
			                           
			                           oos.writeObject(t);
		                                         }

		new Test();
		
   try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Extra_Space_For_FOS_2\\scan.txt"))){
			                 Test t = (Test)ois.readObject();
			                 System.out.println(t.chambers+" "+t.size+" "+t.color);
		}
	}
	{ chambers = 4;}
}
