package app_5_85;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String>  l = Arrays.asList("Alpha A", "Alpha B", "Alpha C");
		
		boolean flag1 = l.stream().allMatch( x -> x.equals("Alpha"));  // false   as  "Alpha A"   is not equal to  "Alpha"
		System.out.println(flag1);
		
		
		boolean flag2 = l.stream().findFirst().get().equals("Alpha A");  // if we change   ("Alpha A") then it may return true
		System.out.println(flag2);                                      // .findFirst()   return Option[obj]
		                                                                // .findFirst().get()  return  obj
		
	                               //  if we do not use .get() then code compile fine but it never return true 	
		                       
		                          // as    Optional[Alpha A]    not equal to    Alpha A
		
		
		boolean flag3 = l.stream().findAny().get().equals("Alpha A"); 
		System.out.println(flag3);
		
		
		boolean flag4  = l.stream().anyMatch(x -> x.equals("Alpha"));
		System.out.println(flag4);
		
		
		
		
		
	}

}
