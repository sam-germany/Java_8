package app_07c_HashSet;

import java.util.HashSet;

class Employee{
	public String name;
	
	
	@Override
	public int hashCode() {
        return 31;
	}
	
     @Override
     public boolean equals(Object obj) {
    	 return true;
     }
     
     @Override
    public String toString() {
    	return name;
    }
     
}
public class Test {
	public static void main(String[] args) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.name= "Sunny";
		e2.name="Bunny";       // as per the hashCode / equals() method decleration only 
		                        // only unique objects will be inserted so  in HashSet
		HashSet hs = new HashSet();    //only Sunny will be inserted , as both are same
		hs.add(e1);                    // so Bunny will not be inserted.
		hs.add(e2);
		
		System.out.println(hs);
		
		
	}

}
