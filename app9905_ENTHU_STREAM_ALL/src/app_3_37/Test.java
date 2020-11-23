package app_3_37;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

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
	
	public String toString() {
		return title+" "+price;
	}
	
}
public class Test {

	public static void main(String[] args) {

		List<Book> books = Arrays.asList(
				                         new Book("Atlas ", 10.0),
				                         new Book("Freedom ", 5.0),
				                         new Book("Gone ", 5.0)
				                  //     new Book("Freedom ", 5.0)
				                         );

		 Map<String, Double> bookMap = books.stream()
			                                        .collect(Collectors.toMap( b -> b.getTitle(),  b ->b.getPrice())
			                                        	    );	            
	
	
         	BiConsumer<String, Double> f = (a,b) ->{ 
		                                             if(a.startsWith("A")) {
		                                         	System.out.println(b);
		                                              }
	                                                };
	         bookMap.forEach(f);
	                                       
	}

}
