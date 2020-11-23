package app_1_63;

import java.util.HashMap;
import java.util.Map;

class Book{
	private String isbn;

	public Book(String isbn) {
		this.isbn = isbn;
	}

	public String getIsbn() {		return isbn;}
	public void setIsbn(String isbn) {  this.isbn = isbn;}

	public int hashCode() {
		return 100;
	}
    public boolean equals(Object o) {
    	return  (o instanceof Book &&((Book)o).isbn.equals(this.isbn));
    }
}
public class Test {
	Map<Book, Integer> map =  new HashMap<Book, Integer>();

	public Test() {
		Book b  = new Book("A111");
		map.put(b, 10);
		
		b = new Book("B222");
		map.put(b, 5);
	}
    Integer getNumberOfCopies(Book b) {
    	return map.get(b);
    }
	public static void main(String[] args) {

		Test bs = new Test();
		Book a = new Book("A111");
		System.out.println(bs.getNumberOfCopies(a));
		
	}

}
