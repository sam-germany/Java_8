package app_6_76;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Booby{
	int i ;
	public Booby() {
		i = 10;
		System.out.println("Bobby");
	}}
class Dooby extends Booby implements Serializable{
	int j ;
	public Dooby() {
		j = 20;
		System.out.println("Dooby");		
	}}
class Tooby extends Dooby{
	int k;
	public Tooby() {
		k = 30;
		System.out.println("Tooby");
	}}
public class Test {
	public static void main(String[] args)  throws Exception{

		Tooby  t = new Tooby();
		
		t.i=100;
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\Extra_Space_For_FOS_2\\rr\\99b.TXT"));
        oos.writeObject(t);
        oos.close();
        
        System.out.println("----- Deserialization starts hier-------");
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\Extra_Space_For_FOS_2\\rr\\99b.TXT"));
        Tooby t2 = (Tooby)ois.readObject();
        ois.close();
        System.out.println(t2.i +" "+t2.j +" "+t2.k);
	}

}
