package appp_109;

import java.util.ArrayList;
import java.util.List;

class MyString1{
	
	String str;

	public MyString1(String str) {
		this.str = str;
	}
}
public class Test {
	public static void main(String[] args) {

		List<MyString1> l = new ArrayList<>();
		
		l.add(new MyString1("Y"));
		l.add(new MyString1("e"));
		l.add(new MyString1("s"));
		
		l.stream().map(i -> i).forEach(System.out::println);

		l.stream().map( i -> i.str).forEach(System.out::println);
	}

}
