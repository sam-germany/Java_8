package app_6_78;

import java.util.ArrayList;
import java.util.List;

public class Test {

// see the code  of app_6_71    it is same as hier
	
	public static void main(String[] args) {
		
	
	
	List<String> l1 = new ArrayList<>();
    l1.add("A");
	
    List <? extends String> l2 = new ArrayList<>();
    //l2.add("X");
    
    
    l1.addAll(l2);    // we are calling  on  l1.addAll(List<String>)    and   l2 --- List<? extends String> so compile
                      // allowees us to do because compiler see that    l2 takes String     as argument 
    
  
 //     l2.addAll(l1);  // this give us compilation error as explained see down
    
    
/* in this code     List <? extends String> l2           means compiler do not know which subclass of Sting as 
	                                                   we want to add. so wie so String is a final class
	                                                  but as compiler does not know about the subclass so we are
                                                     not alloweed to  use  .add(); method

*/	              
	}
}
