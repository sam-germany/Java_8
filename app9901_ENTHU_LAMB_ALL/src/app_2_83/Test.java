package app_2_83;

import java.util.Arrays;
import java.util.List;

interface Lion{
	
	default int calories(List<String> food) {
		System.out.println("----");                      // just forunderstanding i print
		return food.size() * 100;
	}
	
	int eat1(List<String> food);
}
class Tiger implements Lion{
	
	public int eat1(List<String> foods) {
		System.out.println("*****");      
		return foods.size() *200;
	}
}
public class Test {
         public static int size(List<String> list) {
        	 System.out.println("=====");      
        	 return list.size() * 2;
         }
	
         public static void process(List<String> list , Lion c) {
        	 c.eat1(list);
         }
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("b","c","a");
    	Tiger t = new Tiger();
		                                     //  hier is another way to call then we do not need  Tiger t = new Tiger();
		process(list , new Tiger()::eat1); // hier we are calling eat1() method defined int Tiger class
	
		process(list , Test::size);  //  hier we are calling   static method size1()  of Test class directly
  	                                 // without creating its instance 

		process(list , t::calories);      // this is little trickey as   
/*		
                         		                  process(List<String> list , Lion c)
                                              
                                                  process(list , t::calories);      we are passing t::calories  to the
                                                                               ( , Lion c);  so on this  Lion c  we 
		                                                                    can also call the  .calories() method.
		                                                                    this is the point.
		
*/		
}}
