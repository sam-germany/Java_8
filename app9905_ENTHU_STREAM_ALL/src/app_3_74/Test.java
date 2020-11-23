package app_3_74;

import java.util.Arrays;
import java.util.List;
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
}
public class Test {
	public static void main(String[] args) {

		List<Book> bk   = Arrays.asList(
				                           new Book("Gone ", 5.0),
				                           new Book("Gone ", 10.0),  // the problem is  b.getTitle() is key
				                           new Book("Atlas ", 20.0)  // and we have a duplicate key hier Gona, Gona
				                          );
// case 1		                                   key                 value
		bk.stream().collect(Collectors.toMap(b -> b.getTitle(), b -> b.getPrice(), (v1, v2) -> v1+v2))
		           .forEach((a,b) -> System.out.println(a+" "+b));
		
//  (v1, v2) -> v1+v2)   as we have .merge() method in Map , this is apply hier while merging the same keys values
// we are adding the 2 same key  values  and put as one key and result of adding the values in the key
	
		
// case 2		
//              this code will give us run time error as    we have  duplicate key hier 

//		        bk.stream().collect(Collectors.toMap(b -> b.getTitle(), b -> b.getPrice()))
//                         .forEach((a,b) -> System.out.println(a+" "+b));
	}

}
