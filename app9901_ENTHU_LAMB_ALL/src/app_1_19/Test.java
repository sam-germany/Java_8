package app_1_19;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;


class Test2{
	private String title;
	private Double price;
	
	public Test2(String title, Double price) {
		this.title = title;
		this.price = price ;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;                      
	}
	}
	public class Test {
		
	public static void main(String[] args) {

		 Test2 t = new Test2("aaa", null);   
		                                    
		
				 
		 DoubleSupplier ds = t::getPrice;  
		 System.out.println(t.getTitle()+"  " +ds.getAsDouble());    // ("aaa", null);   then  NullPointerException will be
	                                                         	//  thrown by the DoubleSupplier
		 
		 
		 
		 
		 Supplier  s = t::getPrice;       //   ("aaa", null);         if we pass  null   then Supplier will not 
		 System.out.println(s.get());     // throw NullPointerException 
		 

		 // as we already create object of Test2 class so now     t::getPrice   in this way we can call the method directly
	}

}
