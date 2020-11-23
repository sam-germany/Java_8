package app_5_26;

import java.util.ArrayList;
import java.util.Collections;

// example with Comparable
class Address implements Comparable<Address>{

	String street;
	Integer zip;                    // we have to use Integer wrapper insted of int
	                                 // because all wrapper classes implements by-defaule Comparable Interface 
	public Address(String street, int zip) {
		this.street = street;
		this.zip = zip;
	}
	@Override
	public int compareTo(Address o) {
        int x = this.zip.compareTo(o.zip);
		return x == 0 ? this.street.compareTo(o.street) : x;
	}
}
public class Test {
	public static void main(String[] args) {

		ArrayList<Address> a = new ArrayList<>();
		a.add(new Address("dd", 11));
		a.add(new Address("cc", 22));
		a.add(new Address("bb", 44));
		a.add(new Address("aa", 11));
		
		Collections.sort(a);
		
		for(Address b: a) {
			System.out.println(b.street+"  "+b.zip);
		}
		
		
		
	}

}
