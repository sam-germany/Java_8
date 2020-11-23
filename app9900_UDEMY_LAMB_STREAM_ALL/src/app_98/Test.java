package app_98;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Book{
	String title;
	String author;
	double price;

	public Book(String title, String author, double price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}

	public String getAuthor() {
		return this.author;
	}
	
	@Override
	public String toString() {
		return title +" "+ author + " "+ price;
	}
}
public class Test {
	public static void main(String[] args) {

		List<Book> b1 = Arrays.asList( new Book("aa","b1",1),
			                        	new Book("bb","b1",2),
			                        	new Book("cc","c1",3),
			                        	new Book("dd","c1",4),
				                        new Book("ee","d1",5)
				                     ); 
		
	            	b1.stream().collect(Collectors.groupingBy(Book::getAuthor))
                               .forEach((x,y)-> System.out.println(x));;		
		
       //           b1.stream().collect(Collectors.groupingBy(Book::getAuthor))
       //                      .forEach((x,y)-> System.out.println(y));;
		
		
		
		
		
		
	}

}
