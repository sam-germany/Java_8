package app_89;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
                                             
		       // assume we have stream of   {1,2,3,4,5,6,7,8,9....};
		
		Stream<Integer> s = Stream.iterate(1, y -> y  + 1);
		
		
       System.out.println(s.anyMatch(y  -> y > 1));  //
                   
                                                    // according to this (predicate) condition 
                                                    //  it checks till any match it found  1>1  return false
	                                                //  then it goes to  2>1  it return true and 
                                                    //  operation is terminated
		
		
		System.out.println(s.allMatch(y  -> y > 1)); // it means allMatch must happen according to given condition
		 
		                                             // it check all the matches till end and then we will get a 
		                                             // result,  1> 1    return false , as first return false
		                                             // then it will not go further to check and operation terminated

		
		
		System.out.println(s.noneMatch(y  -> y > 1)); // it means noMatch should happen according to given condition.
		
		                                               // in this (predicate) condition it check that all the values should
		                                              // not match this condition,  1>1   return false  for the the condition  
		                                              // but  for noneMatch() it return true as condition is not satisfied
		                                              // as it return true then it search further 2>1  return true, 
		                                              // but for  noneMatch() return false as the condition matches
		                                              // as it return false then it  terminate the operation
		
		// read the explanation 2-3 times and i  understand it easily
	}

}
