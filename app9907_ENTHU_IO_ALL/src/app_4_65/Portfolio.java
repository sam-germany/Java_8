package app_4_65;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Bond{
 	String ticker= "bac";
 	double coupon = 8.3;
}
public class Portfolio  implements Serializable{

	String accountName;
	transient Bond b = new Bond();
	
	public void writeObject(ObjectOutputStream os) throws Exception{
		
		os.defaultWriteObject();
		os.writeObject(b.ticker);
		os.writeDouble(b.coupon);
	}
	
	private void readObject(ObjectInputStream os) throws Exception{
		
		os.defaultReadObject();
		this.b = new Bond();
		b.ticker = (String) os.readObject();
		b.coupon = os.readDouble();
	}
}
/*
 * If you use the default mechanism to write the non-transient parts of your object, 
 * you must call defaultWriteObject( ) as the first operation in writeObject( ), 
 * and defaultReadObject( ) as the first operation in readObject( ).	
 */
	