package app_3_16;

import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

public class Test {

	private String title;
	private Double price;
	
	public Test(String title, Double price) {

		this.title = title;
		this.price = price;
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
	public static void main(String[] args) {

		Test t1 = new Test("aa", 30.0);
		Test t2  = new Test("bb", null);
		
		Supplier sup1 = t1::getPrice;
		System.out.println(t1.getTitle()+" "+sup1.get());
	
		
		Supplier sup2 = t2::getPrice;
		System.out.println(t2.getTitle()+"  "+sup2.get());
		
		
		DoubleSupplier d1 = t2::getPrice;
		System.out.println(d1.getAsDouble());  // Supplier can take null and give as output also a null value
                                               // but as in this case we pass null for DoubleSupplier then it will
	}                                         // throw a NullPointerException

}
