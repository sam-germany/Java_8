package app_2_69;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

class Bond {

	String ticker = "bac";
	double coupon = 8.3;
	Date maturity = new Date();
   }
class Portfolio implements Serializable {
	
	String accountName;
	transient Bond[] bonds;
  
      private void writeObject(ObjectOutputStream os) throws Exception{
	 
    	  os.defaultWriteObject();
    	  os.writeInt(bonds.length);
    	  
    	  for(int i=0; i< bonds.length; i++) {
    		    
    		  os.writeObject(bonds[i].ticker);
    		  os.writeObject(bonds[i].coupon);
    		  os.writeObject(bonds[i].maturity);
    	  }
      }
      private void readObject(ObjectInputStream os) throws Exception{
    	  
    	  os.defaultReadObject();
    	  int n = os.readInt();
    	  
    	  this.bonds = new Bond[n];
    	  
    	  for(int i=0; i<bonds.length; i++) {
    		  bonds[i] = new Bond();
    		  bonds[i].ticker = (String)os.readObject();
    		  bonds[i].coupon = os.readDouble();
    		  bonds[i].maturity = (Date)os.readObject();
    	  }
      }}
public class Test {
	public static void main(String[] args) {

		 Portfolio p = new Portfolio();
		 
	}

}
