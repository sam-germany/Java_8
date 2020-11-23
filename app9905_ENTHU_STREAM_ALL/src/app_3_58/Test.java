package app_3_58;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Book{
	private int id;
	private String title;
	private String genre;
	private String author;
	private double price;
	
	public Book(int id, String title, String genre, String author, double price) {
		this.id = id;
		this.title = title;
		this.genre = genre;
		this.author = author;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return  id +"-"+ title +"-"+ genre +"-"+ author +"-"+ price;
	}
}
public class Test {

	public static void main(String[] args) {

		List<Book> books =  Arrays.asList(
				                        new Book(11,"aa","a1","aaa",1.0),
				                        new Book(22,"aa","b1","aaa",2.0),
				                        new Book(33,"aa","c1","bbb",3.0),
				                        new Book(44,"aa","d1","bbb",4.0)
				                          );
		
		Map<String, List<Book>>c1 = null;
		
		c1 = books.stream().collect(Collectors.groupingBy(Book::getTitle  ));
		System.out.println(c1);
		
		
		System.out.println("-----------------------------------");
	
      
		Map<String, Map<String, List<Book>>> c2 = null;
		c2 = books.stream().collect(Collectors.groupingBy(Book::getTitle,
				                                       Collectors.groupingBy(Book::getAuthor)
				                                                  ));
		System.out.println(c2);
	
		
		System.out.println("---------------------------------------------");
		
		Map<String, Map<String, List<Book>>> c3 = null;
		c3 = books.stream().collect(Collectors.groupingBy(  x -> x.getTitle(),
			                                       Collectors.groupingBy(x ->x.getAuthor())
			                                                  ));
		System.out.println(c3);
	
	
	}

}
