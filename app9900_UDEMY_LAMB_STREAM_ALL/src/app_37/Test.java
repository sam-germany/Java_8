package app_37;

import java.util.Arrays;                             
import java.util.List;
import java.util.function.Consumer;            //  (1)  we can redeclare the super Interface abstract method as if we
                                                   // use  @Override annotation then we must use   void accept() same
interface StringConsumer1 extends Consumer<String>{  // name but we can redefine it by providing it body. 
	
	// @Override                                      
     default void accept11(String t) {                
             System.out.println(t.toLowerCase());    //need to understand the changes i done in this code and the code
    	}                                             //in udemy example. 
}                                                      // this is not a  Consumer Interface   void accept() method.
public class Test {                                   // this is the   default  method we can change its name also
	public static void main(String[] args) {          //  as it has a body so we can not make it abstract
		                                              // but the Interface internally has the   Consumer  void accept()
		StringConsumer1 con  = new StringConsumer1() {     // method and in the main method() we @Override it 
			                                              // as we @Override it in main method so it will be called at
			                             @Override                          // run time
										 public void accept(String t) {
		                                 System.out.println(t.toUpperCase());
		    	                                    }
		                                      };
       List<String> l  = Arrays.asList("Dr","Mr","Miss","Mrs");
      
       l.forEach(con);

  
/*
   it is simple to understand  , main point is  
   (1)
   l.forEach(con);   we can not make it like this   con.forEach(l);    because  Consumer does not return
   
   anything. but when we use  Function or any other then we call the method on the  Interface but in case
   
   of Consumer it is not alloweed.
     
   (2)  hier     interface StringConsumer1    is not a Functiona    
         
 */

       
       
       
       
}}
