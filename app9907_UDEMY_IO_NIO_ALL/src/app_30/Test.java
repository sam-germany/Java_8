package app_30;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Optional;

public class Test  {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException  {

		Optional<LocalDate> op1 = Optional.of(LocalDate.of(2018, 12, 1));
		
		
	try(  ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\\\Extra_Space_For_FOS\\\\r1.txt"));
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\\\Extra_Space_For_FOS\\\\r1.txt"))   )
	   {
		
		oos.writeObject(op1);
		
		Optional<?> op2  =  (Optional<?>)ois.readObject();
		System.out.println(op2.get());
		
		
	   }
	}

}
