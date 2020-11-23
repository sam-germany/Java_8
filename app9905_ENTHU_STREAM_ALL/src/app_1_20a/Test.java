package app_1_20a;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(11,11,22,12,13);
		
		l.stream()
		 .peek(System.out::println)
		 .distinct()
		 .anyMatch(x -> x == 11 );  //  .anyMatch()   waits for true , as first value is 11 it return true
		                            //  and anyMatch() do not  search further

		System.out.println("-------------");
	
		l.stream()
		 .peek(System.out::println)
		 .noneMatch(x ->  x % 11  > 0);  //  this condition means their must be a reminder of 1 >0 then
		                                 // this condition return true and .noneMatch() stop searching
		                                // but hier 11,11,22  they all are devided and 0 zero reminder
	}		                            // so .noneMatch() will go till the condition return false
}
