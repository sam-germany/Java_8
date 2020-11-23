package app_5_26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
//example with Compaarator
class Address2{

	String street;
	Integer zip;
	
	public Address2(String street, int zip) {
		this.street = street;
		this.zip = zip;
	}
}
public class Test2 {
	public static void main(String[] args) {

		ArrayList<Address2> a = new ArrayList<>();
		a.add(new Address2("dd", 11));
		a.add(new Address2("cc", 22));
		a.add(new Address2("bb", 44));
		a.add(new Address2("aa", 11));
		
		Collections.sort(a, new Comparator<Address2>() {
			
			             public int compare(Address2 o1, Address2 o2) {
			            	  int x = o1.zip.compareTo(o2.zip);
			            	  return x == 0 ? o1.street.compareTo(o2.street): x;
			            	 
			             };
			
		});
		
		for(Address2 b: a) {
			System.out.println(b.street+"  "+b.zip);
		}
		
		
		
	}

}
