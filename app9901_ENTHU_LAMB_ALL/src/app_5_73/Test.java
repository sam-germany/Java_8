package app_5_73;

import java.util.Arrays;
import java.util.List;

interface Reader1{
	
	void read1(Test t); 
	
	default  void unread1(Test t) { }
}


public class Test {
	private String id;
	private String name;
	
	public Test(String id, String name) {
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
	
		List<Test> list = Arrays.asList(
				                     new Test(" bb", "-b1"),
				                     new Test(" aa", "-a1"),
				                     new Test(" cc", "-c1")   );

		Reader1 r = b->{   System.out.println("Reading book"+ b.getName());    };
		 
		list.forEach(x -> r.read1(x));          // as in the Reader Interface we  have   void read(Test t);
		                              // as the return type of the method is void   so we can use it as Consumer
		                                    // as we have (Test t) as argument so hier in the  Lambda Expression
		                                     // we can  call    b.getTitle();  as the     

//		list.forEach(Reader1::read1);   // error we can not call directly a interface  and abstract method, 
		                               // we have    
		
		System.out.println("-----------------");
		
		  list.forEach(x -> r.unread1(x));
		                                 // this unread(); method we can call but lambda Expression we can call
	}                                   // call only on  abstract method so no use to see this

}
