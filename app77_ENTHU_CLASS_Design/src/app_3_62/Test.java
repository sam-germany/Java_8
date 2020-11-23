package app_3_62;

import java.util.HashMap;
import java.util.Map;

class Book {
	private String  isbn;


	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public int hashCode() {
			return 100;
		}
	public boolean equals(Object o) {
		return (o instanceof Book && ((Book) o).isbn.equals(isbn));
	}
}
class BookStore{
	
	Map<Book, Integer> map = new HashMap<Book, Integer>();
	

	public void addBook1(Book b, int n) {
		map.put(b, n);
	}
	       int getNum(Book b) {
		return map.get(b);
	}}
public class Test {
    static     BookStore bs = new BookStore();

           public static void main(String[] args) {
			Book b  = new Book();
			b.setIsbn("111");
			
			bs.addBook1(b, 10);
			
		System.out.println(bs.getNum(b));		
		Book b1  = new Book();
		b1.setIsbn("111");
		
		bs.addBook1(b1, 133);
		System.out.println(bs.getNum(b1));
           }
}
