package app_2_52;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;

public class Test {

	private String name;
	private String category;
	private double price;
	
	public Test(String name, String category, double price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public static void main(String[] args) {

		List<Test> t = Arrays.asList(  new Test("aa",  "test",  3.0),
				                       new Test("bb",  "test",  6.0),
		                        	   new Test("cc",  "real",  3.0),
				                       new Test("dd",  "real", 6.0)
				                     );
	
		ToDoubleFunction<Test> priceF =  Test::getPrice;  // x -> x.getPrice();   both give same output
		
		    t.stream()  
		     .collect(Collectors.groupingBy(Test::getCategory))   // ( x -> x.getCategory))  both are same
		     .forEach( (a,b) ->{                              //  (a,b)  a is key and b is value
		    	               double av = b.stream()
		    	            		        .collect(Collectors.averagingDouble(priceF));
		    	                                                   // this method return permitive double
		    	               System.out.println(a +" "+av);
             		        });
		
		
	// Note    ToDoubleFunction<Test> priceF =  Test::getPrice;   he take this line and after
	//        that priceF he put as argument  but we an also put at line 52  (Test::getPrice) this also 	    
    //                                                                               work same	
	} // Note   .groupingBy() method return  Map <key, value>

}
