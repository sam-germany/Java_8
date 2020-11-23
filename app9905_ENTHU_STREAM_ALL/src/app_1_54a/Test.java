package app_1_54a;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Book{
	
	private String title;
	private String gener;
	private String author;
	
	public Book( String title, String gener, String author) {
		this.title = title;
		this.gener = gener;
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGener() {
		return gener;
	}
	public void setGener(String gener) {
		this.gener = gener;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}

	/*public static class BookFilter implements Predicate<Book>{
		public static boolean isFiction(Book b) {
			return b.getGener().equals("fiction");
		}
	
		 public boolean test(Book b) {
			 return isFiction(b);
			 
		 }
	}  */
	}
public class Test {
	public static void main(String[] args) {

		List<Book> b1 = Arrays.asList(
				                    new Book("30 Days", "fiction","k larsen"),
		                            new Book("Fast Food Nation", "non-fiction", "Sric Schlosser"),
		                            new Book("Wired","fiction","D Richards")
                    				);
	
	        b1.stream()
	                 .filter((Book b) ->b.getGener().equals("fiction"))
	                 .forEach((Book b) -> System.out.print(b.getTitle() + "  , "));
	
	        
	
	}

}
