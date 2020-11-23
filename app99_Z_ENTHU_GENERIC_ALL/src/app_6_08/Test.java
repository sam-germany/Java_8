package app_6_08;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String> sa = Arrays.asList("100","100.05","25.50", "100","2","101");
		
		Collections.sort(sa,null);
		System.out.println(sa);     // DNSO  this will work normally 
		
		Object [] sa2 = {100,100,100};   // this will work if put only one type of values
		Collections.sort(Arrays.asList(sa2),null);  // if we put int , double then also exception
		
		System.out.println(sa2[0]+ " "+ sa2[1] +" "+ sa2[2]);
		
		
		
		//  read explanation easy to understand 
		
	}

}
