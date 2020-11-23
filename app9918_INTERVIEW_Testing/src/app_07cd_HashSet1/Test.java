package app_07cd_HashSet1;

import java.util.HashSet;
import java.util.Set;


public class Test {

	static class Element{
		String name;
		int age;
		
		Element(String s, int a){
			name = s;
			age =a;
		}
		
	    public boolean equals(Object o) {
			   return this.age == ((Element)o).age;
		}
	 
	   public int hashCode() {
		   return name.length();
	   }
	  
	   public String toString() {                  // as Set does not allowees Duplicate so HashSet<> 
		   return name;                            //also does not two objects are same when   
	   }                                          // (1) when boolean equals()  return true  
	}                                             //(2) when  int hashCode()  return same hash Code.
	public static void main(String[] args) {        
                                                    
		Set<Element> s = new HashSet<>();
		s.add(new Element("Pba",21));            // the length of name is same.
		s.add(new Element("Cdef",21));           // hier 2  objects are equal  whoes age is same and 
		s.add(new Element("Sh",21));
		s.add(new Element("Sh",21));
		s.add(new Element("zzz",21));
		s.add(new Element("sss",21));
		
		
		System.out.println(s);
	}

	
}
