package app_6_71;

import java.util.ArrayList;
import java.util.List;

class Shape{ }

public class Test {
	
/*	public List<Shape> m3 (ArrayList <? extends Shape> strList){
		
		      List<? extends Shape> list = new ArrayList<>();
		                         
		      list.addAll(strList);
		      return list;
	        }	
*/  /*                                 this will not compile	
	                    (1)  the return type of m3  method is       List<Shape> 
	                    (2)   it takes a argument m3 (ArrayList <? extends Shape> strList)
	                   (3)  List<? extends Shape> list = new ArrayList<>();       means this  list can take        
	                                                                       objects of type  Shape and subclasse
	                                                          of Shape, but compiler does not know which  exact 
                                       subclass we want to add  so this will give us compilation error
*/	
	
	public List<? extends Shape> m4 (ArrayList <? extends Shape> strList){
		
	          List<Shape> list = new ArrayList<>();
	          list.add(new Shape());
	          list.addAll(strList);
	      
	    return list;
	}
/*
 * very easy to understand 
 (1) the return type of m4 method is       List<? extends Shape> m4   means return type should be of Shape or subclasse of Shape
                                                                                               
    the  argument it takes is m4 (ArrayList <? extends Shape> strList)      means argument is of Shape of subclasses of Shape
   
   we created a list  List<Shape>  means the obj we are adding are only of Shape type so their is no issue with 
   the compiler to know any sub class of Shape will come or not becuase only Shape type is coming
 */
	
	public void m5 (ArrayList <? extends Shape> strList){
		
	      List<Shape> list = new ArrayList<>();
	      list.add(new Shape());
	      list.addAll(strList);
	}

// same reason as explained in the above exampel
  
  
	
	
/*	public void m6  (ArrayList <? extends Shape> strList){
		
	      List<? extends Shape> list = new ArrayList<>();
	      list.add(new Shape());
	      list.addAll(strList);
	}
*/ /*                                        hier as we created  a List of
*                                            List<? extends Shape> list = new ArrayList<>();
                                                              
                                             so at the time of adding  compiler does not know which subclass exactelly                 
                                             we are going to add   so  compilation error
     
*/
}