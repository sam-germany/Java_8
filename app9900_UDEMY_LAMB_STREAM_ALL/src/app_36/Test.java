package app_36;

import java.util.function.UnaryOperator;

public class Test {

	public static void main(String[] args) {

		UnaryOperator<String> opr = s -> s.toString().toUpperCase();
		
		System.out.println(opr.apply(new String("Abckdef")));      // this will work as we define <String>
	
		
		
/*
         UnaryOperator<String> opr = s -> s.toString().toUpperCase(); //Line n1
         
         System.out.println(opr.apply(new StringBuilder("Hello"))); //Line n2
     

 */
	}}

/*
   simple to understand  points
   (1) String class has   .toUpperCase()  method but  StringBuilder does not has this method
   
   (2) so this is the reason we use hier  .toString() method to convert the  StringBuilder object into String
   
   (3) the main  error point is  we use UnaryOperator it take the Object and return the same object
   
   hier if UnaryOperator  take a StringBuilder and return also StringBuilder    but hier we use 
   
   .toString().toUpperCase() method   that convert StringBuilder object to String   so hier UnaryOperator 
   
     return  String not StringBuilder   so this is the problem with the error.
  
  
  
 
  
 
 */
