package app_6_69;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Boo{
	public Boo() {

		System.out.println("In Boo");
	}}
class BooBoo extends Boo{
	public BooBoo() {                           // hier compiler add by-default  super(); this is call for super class
		System.out.println( "in BooBoo");
	}}
class Moo extends BooBoo implements Serializable{
	int moo = 10;
	{
		System.out.println("moo set to 10");
	}
	public Moo() {                          //  hier bydefault compiler add  super();
		System.out.println("In moo");
	}}
public class Test {
	public static void main(String[] args) throws Exception{

		Moo moo = new Moo();
		moo.moo = 20;
		
		FileOutputStream fos= new FileOutputStream("D:\\Extra_Space_For_FOS_2\\rr\\99b.TXT");
		ObjectOutputStream os = new ObjectOutputStream(fos);
		os.writeObject(moo);
		os.close();
		
		System.out.println(" --------- now from hier deserialization starts  ---------------");
		
		FileInputStream fis = new FileInputStream("D:\\Extra_Space_For_FOS_2\\rr\\99b.TXT");
		ObjectInputStream is = new ObjectInputStream(fis);
		
		Moo m = (Moo) is.readObject();
		is.close();
		System.out.println(m.moo);
		
		
// Note:  at the time of de-serialization  only super class constructor will be called as hier  Moo class
//        no_args  constructor will not be called. only its super class constructor will be called		
	}

}
