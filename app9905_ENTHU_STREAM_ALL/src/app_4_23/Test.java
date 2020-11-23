package app_4_23;

import java.util.Arrays;
import java.util.List;

class Book{
	
	private String title;
	private double price;
	
	public Book(String title, double price) {
		super();
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

		List<Book> bk = Arrays.asList(
				                     new Book("Gone ", 10.0),
				                     new Book("Atlas ", 10.0),
				                     new Book("Freedom ", 5.0),
				                     new Book("Gone ", 5.0)
				                     );
		double s = bk.stream()
				            .filter(b ->b.getPrice() > 5.0)
				            .mapToInt(b -> (int)b.getPrice())     // .mapToDouble(b -> b.getPrice()) 
		                    .sum();                               // or this will work
		System.out.println(s);
		
		System.out.println("-----------------------------------------");
		
		
	 	double s2 = bk.stream()
				              .mapToDouble(b ->b.getPrice() > 5 ? b.getPrice() : 0.0)
				              .sum();
		System.out.println(s2);
		
		System.out.println("-------------------------------------------");

		double s3 = bk.stream()
				               .mapToDouble(b -> b.getPrice())
				               .filter( b -> b > 5.0)
				               .sum();
		System.out.println(s3);
	}

}
