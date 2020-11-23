package app_1_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
	
	String [] p = {"1","3","2"};
	
	List<?>  l = new ArrayList<>(Arrays.asList(p));

	//l.add("43");         as we define  a List from    new ArrayList<>(Arrays.asList(p)); so normally we cann add/remove        
	                       // all we can do but because of <?>  whildcard we can not  .add() anything because compiler does
	                       // not know which type we are going to add hier
	
	// String s = l.get(1);  this will give us compilation error as  we use <?>
	
	Object s = l.get(1);

	System.out.println(s);
	
	
//	List<Integer>  l2 = new ArrayList<>(Arrays.asList(p));    error  as we put  "1"   String []  Array their so 
//   List<String>   this will compile fine as we are putting  String [] Array  	
	}
	
}

