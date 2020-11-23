package app_3_38;

import java.util.Arrays;
import java.util.List;



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
                                           new Book("Freedom  ", 5.0),
                                           new Book("Gone ", 5.0),
                                           new Book("Midnight ", 15.0)
                                          );
	                          
                books.stream()
                             .filter(b -> b.getTitle().startsWith("F"))
                             .forEach(b -> b.setPrice(10.0));
		     
                books.stream()
                             .forEach(b -> System.out.println( b.getTitle() +"  "+b.getPrice()));
                
                System.out.println(books);
	
}

}
