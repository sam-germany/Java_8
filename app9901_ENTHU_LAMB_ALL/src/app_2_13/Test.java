package app_2_13;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

class Book{
	 
	private String title;
	private double price;

	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
public class Test {
	public static void main(String[] args) {

		List<Book> b = Arrays.asList( new Book("cc",30.0),
				                      new Book("bb",20.0),
		                        		new Book("aa",10.0)
				                       );
		double averagePrice = b.stream()
				               .filter(x -> x.getPrice() > 10)
				               .mapToDouble( x -> x.getPrice())
				               .average()     // if we write the code till hier, then as shown down
				               .getAsDouble();   // .average() method return  OptionalDouble
		                                         // but if we put .getAsDouble() then it reutrn premitive 
		System.out.println(averagePrice);                                               // double 
		  
		System.out.println("-------------------");
		
		OptionalDouble averagePrice1 = b.stream()
	                                    .filter(x -> x.getPrice() > 10)
	                                    .mapToDouble( x -> x.getPrice())
	                                    .average();         // as shown in this exampe .average() return
                                                            // OptionalDouble
     System.out.println(averagePrice1);
		
	}

}
