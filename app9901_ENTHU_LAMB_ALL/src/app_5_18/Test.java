package app_5_18;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

class Book{
	private int id;
	private String title;
	
	public Book(int id, String title) {
		this.id = id;
		this.title = title;
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
}
public class Test {
	public static void main(String[] args) {

		List<Book> book  = Arrays.asList(new Book(1,"aa"),
				                         new Book(2,"bb"),
				                         new Book(3,"cc")
				                           );
		
		Consumer<Book> c =  x -> System.out.println(x.getId()+"  "+x.getTitle());
		
		book.forEach(c);   // this is the way i print it always but he make  
		                   // c.accept(book);   this will not compiler it tried all
		
	}

}
