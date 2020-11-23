package app_4_54;

import java.util.function.Supplier;

class MyProcessor{
	
	public void p1() {
		System.out.println("Processing");
	}
}

public class Test {

	public static void main(String[] args) {
  
		p2(()-> new MyProcessor());
      
      //both are correct 
      
      Test.p2(MyProcessor::new);
	}
	
	public static void p2(Supplier<MyProcessor> s) {
		s.get().p1();         
	}

}
// Note:   main point to understand is in   Supplier  .get(); method is defined  so we are hier calling

//      s.get()   method on Supplier     then   s.get().p1();     