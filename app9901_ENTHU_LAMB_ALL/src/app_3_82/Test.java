package app_3_82;

import java.util.function.Function;
import java.util.function.Supplier;

public class Test {

	int value;
	public Test() {
		value = 11;
	}
	
	public Test( int value) {
		this.value = value;
	}
	
	
	public void process() {
		System.out.println(value);
	}
	public static void main(String[] args) {

		
//	Supplier<Test> supp1 =  x -> x()  or    x -> new Test();   not able to convert it into lambda expression

		
		                                   // Note:   Supplier, Perdicate these are not like Lambda Expression
		                                  // that we must call on a @Functional Interface, 
                                    		// these Interfaces we can all on anywhere anytype
		
		Supplier<Test> supp = Test::new;  // hier we are creating a raw type of  new Test(); object 
		Test t = supp.get();              //  as .get(); does not take any agrument so no-argument constructor
		t.process();                      // will be called
		

		Function<Integer, Test> f  = Test::new; // hier we take a integer value  and return a  new Test(int);
		Test t1 = f.apply(22);                  // so as shown the  (int value);  constructor will be called
		t1.process();                           // if we just try to hide the arg-constructor then it will
		                                        // immeaditely give us compilation error
		
		
	}

}
