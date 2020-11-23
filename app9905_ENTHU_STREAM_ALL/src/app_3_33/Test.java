package app_3_33;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Book{
	private String title;
	private String genre;
	public Book(String title, String genre) {
		this.title = title;
		this.genre = genre;
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
	public String toString() {
		return title+" "+genre;
	}
}
public class Test {

	public static void main(String[] args) {

		List<Book> books = Arrays.asList(
				                        new Book("ff","rami"),
				                        new Book("bb","kami"),
				                        new Book("cc","sami"),
				                        new Book("dd","dami")
				                        );
		
		Comparator<Book> c1 = (b1, b2) -> b1.getGenre().compareTo(b2.getGenre());
		
		books.stream().sorted(c1.thenComparing(Book::getTitle)).forEach(System.out::println);;
	

		System.out.println(books);
		

		books.stream()
         .filter(b -> b.getTitle().startsWith("f"))
         .forEach(b -> b.setGenre("RRR"));
		
		System.out.println(books);
		
	}

}
