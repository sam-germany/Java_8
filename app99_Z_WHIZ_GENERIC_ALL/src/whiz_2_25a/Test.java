package whiz_2_25a;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List l = new ArrayList();
		
		l.add("1");
		l.add("2");
		l.add("3");
		l.add("4");
		
		
		System.out.println(l);
		
		l.add(1,"X");             //  .add();  does not return anything so we can not put in syso(); 
		
		System.out.println(l.set(3, "8")); // .set() method replace  the old value into new value and return the
		                                     // the new old value, But if we replace (3,"8") to (10,"8")
		System.out.println(l);               // as 10 index does not exists then this code throws exception.
		
	}

}
