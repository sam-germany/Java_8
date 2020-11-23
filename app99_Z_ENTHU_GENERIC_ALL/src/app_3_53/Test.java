package app_3_53;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {

		Map<Object , ? super ArrayList> m = new LinkedHashMap<>();
	
		m.put("1", new ArrayList());
		
		System.out.println(m);
		
/*	very Good explanation just draw this in mind. 
point(1)
 	
  Map<Object, ? super ArrayList> m = new LinkedHashMap<Object, ArrayList>();   
  You should read it aloud as follows: 'm' is declared to be of type Map that takes an instance of 
  Object class as a key and an instance of 'a class that is either ArrayList or a superclass of 
  Arraylist' as value. This means that the value can be an instance of ArrayList or its subclass 
  (since an ArrayList object or its subclass object can be assigned to a reference of type
   ArrayList or its super class.). However, you cannot put Object (which is a superclass of ArrayList) 
   in it because the compiler doesn't know the exact superclass that 'm' can take. It could be
    AbstractList, or Object, or any other super class of ArrayList. 
    The compiler only knows that it is a superclass but not the exact type. 
    So option 4 is correct but 5 is wrong.
	
point(2)

 Just the opposite of super is extends. Consider the following method: 
 
 public void m1(List<? extends Number> list) {  
 
   list.add(new Integer(10));            //Error at compile time because the compiler    
	                                     //only knows that list contains Number or its subclass objects. 
	                                                  But it doesn't know the exact type.
	                                    //Therefore, it will not allow you to add anything to it.
	                      
Number n = list.get(1);               //This will work because the compiler knows that every object in list IS-A Number.      
	
*/	
	
	}

}
