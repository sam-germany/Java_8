package app_1_77_Compute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {



	Map<String, List<Double>> map = new HashMap<>();


	public void process1(String name, Double value1) {
		List<Double> value2 = map.get(name); 
	
	       if( value2 == null) {
	    	   
	          	value2 = new ArrayList<Double>();
	    	    map.put(name, value2);
	                           }
	       
	    value2.add(value1);
		
	}

 // both process1() and process2() are same method, to understand process2()  see the above  process1() method
	
	
 public void process2(String name, Double value1){
             
	                 map.computeIfAbsent(name, (x) -> new ArrayList<Double>())
	                    .add(value1);  
                                                  } 
 
//hier (x)  is Object as (name)  so for every  Object   a value is added through this method.
// it can be a new or old object ,  this method first check if this object (key) exists or not.
// as  .computeIfAbsent(Function) takes Function as argument so only  (x)  one argument it takes and
// it add the value to that object and return that object back.

  
//    Map.computeIfAbsent( Function);         it takes a Function as argument.
// very important example just for understanding how comput() method works. 
 
 
//m.put("111", new Account("111"));          	   
//m.put("111", new Test("111",200.00));     just think in mind like this we are going to add a object    	   
	     
//if we draw like this in mind then it is easy to understand. 
}
 
