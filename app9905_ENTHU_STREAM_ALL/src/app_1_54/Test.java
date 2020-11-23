package app_1_54;

import java.util.Arrays;
import java.util.List;

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

	public static class BookFilter{
		public static boolean isFiction(Book b) {
			return b.getGener().equals("fiction");
		}}}
public class Test {
	public static void main(String[] args) {

		List<Book> b1 = Arrays.asList(
				                    new Book("30 Days",   "fiction",     "k larsen"),
		                            new Book("Fast Food", "non-fiction", "Sric Schlosser"),
		                            new Book("Wired",     "fiction",     "D Richards")
                    				);
	
	        b1.stream()
	                 .filter((Book b) -> Book.BookFilter.isFiction(b))
	                 .forEach((Book b) -> System.out.println(b.getTitle() + "  , "));
	
	        
	        System.out.println("---------------------------------");
	        
	        
	        b1.stream()
	                  .filter(Book.BookFilter::isFiction)
	                  .forEach((Book b) -> System.out.println(b.getTitle() + "  , "));
	
	// hier .filter() method return the complete Book object that passs the condition
	 // note as we know static inner class is not associated with out , so in this case we are not       
	// creating object of outer we are directly calling the static innerclass .sFiction() method
	
	}

}
