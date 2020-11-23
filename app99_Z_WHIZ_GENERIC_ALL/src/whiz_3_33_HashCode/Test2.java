package whiz_3_33_HashCode;

import java.util.HashSet;
import java.util.Set;


public class Test2 {

	static class Element{
		String name;
		int age;
		
		Element(String s, int a){
			name = s;
			age =a;
		}
		
	    public boolean equals(Object o) {
			   return name == ((Element)o).name;
		}
	 
	   public int hashCode() {
		   return age;
	   }
	  
	   public String toString() {
		   return name;
	   }
	}                                             // as Set does not allowees Duplicate so HashSet<> also does not
	public static void main(String[] args) {      // two objects are same when   
                                                  // (1) when boolean equals()  return true  
		Set<Element> s = new HashSet<>();         //(2) when  int hashCode()  return same hash Code.
		s.add(new Element("Pba",21));
		s.add(new Element("Cdef",21));              // hier 2  objects are equal  whoes age is same and 
		s.add(new Element("Sh",21));                  // the length of name is same.
		s.add(new Element("Sh",21));
		s.add(new Element("zzz",21));
		s.add(new Element("sss",21));
		
		
		System.out.println(s);
	}

	
}
