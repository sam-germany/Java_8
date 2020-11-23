package app_1_75;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<String>  names = Arrays.asList("greg", "dave", "don", "ed", "fred","w");
		
	// case 1	
		Map<Integer, List<String>> data = names.stream()
                                       .collect(Collectors.groupingBy(
                                                                    String::length  // or x -> x.length()
                                                                    ));             // bioth are same
 
           System.out.println(data);
           System.out.println(data.keySet()+" "+data.values());
	
   //	String::length    length() return int  so int become the key, and as  in begining   
   //   we defined -- List<String> names --  so the value returned by the  Collectors.groupingBy()  
  //  return   List<String>  as value  to the int key.		
           
		System.out.println("--------------------------------");
		
		
	// case 2	
		Map<Integer, Long> data2 = names.stream()
				                       .collect(Collectors.groupingBy(
				                                                     String::length,
				                                                     Collectors.counting()
				                                                      ));

		System.out.println(data2);
		System.out.println(data2.keySet()+"" + data2.values());

// hier we use .groupingBy()  String::length  -- it become the key
//      Collectors.counting()  the method return  long value,  counting the number of the String object		
//    		
		
		
		
		
		
		
		
		
		
		
		
	// if we remove String::length  then it will give us compilation error	
		
	}

}
