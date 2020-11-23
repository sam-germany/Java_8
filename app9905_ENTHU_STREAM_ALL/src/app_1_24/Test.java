package app_1_24;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

class MyProcessor{
	Integer value;
	
	public MyProcessor(Integer value) {
		this.value = value;
	}
	public void process() {
		System.out.println(value+"----");
	}
}
public class Test {

	public static void main(String[] args) {

		List<Integer> ls = Arrays.asList(1,2,3);
		
		ls.stream()
		          .map(MyProcessor::new)  // normally we make with ::new  a object with no-args constructor
		          .forEach(MyProcessor::process);// but as the elements of list is passing and we are 
		                                         // creating a object with  ::new  then it call internally
		                                        // the (args) constructor hier and if we do not provide 
		                                        // (args) constructor then we will get compilation error
		                                        // must always create obj like this in .map() otherwise 
		                                        // we will get error
		
		
  //		ls.stream().forEach(MyProcessor::process);  this will give us compilation error
//       as already explained that we need to create obj  first in the .map()  		
		System.out.println("---------------------------------------------");
		
		ls.stream()
		          .map(x -> {
		        	     Function<Integer, MyProcessor> f = MyProcessor::new;
		        	      return f.apply(x);      
		                   })
		          .forEach(MyProcessor::process);
		
		// hier also in this example we are calling the (args) constructor easily to understand
		// with  f.apply(x); we are passing the value trough the constructor
	}

}
