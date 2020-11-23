package app_5_64;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Test {

	public static void main(String[] args) {

	IntStream st1 = IntStream.of(2,5,6,8);
	
	Predicate pre = Predicate.isEqual(5);  
	
	          
	              st1.boxed()
	                 .filter(pre)
	                 .forEach(System.out::print);
	
// in this case we have a premitive IntStream. but in the  .filter() method we are using	              
// normal Predicate , this is not the premitive version of Predicate. so  as we are using
// 	 .boxed() method to convert the premative Stream into Wrapper Stream and then we can use
//  in  .filter() method   normal     Predicate pre = 
	              
	              
	              
	   System.out.println("------------------------");
	   
/*	   
	   IntStream st2 = IntStream.of(2,5,6,8);
		
		Predicate pre2 =  Predicate.isEqual(7); 

		            
		           st2.filter((IntPredicate) pre2)
		              .forEach(System.out::println);    
		
	*/	
	
}}
