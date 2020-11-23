package app_2_12;

public class Test {    // we do not define Generic      class Test<T>     so in this code class Test is a non Generic class    

	private static <T extends Number> void print(T t) {
		System.out.println(t.intValue());
	}
     
	public static  void main(String[] args) {
	
		print(new Double(5.5));
	}
	}

// read both the error points. // main point is as        class Test   is not  class Text<T>  so we defined a
//  a non Generic class so in a non Generic class method the Type paramenter must come before return type.

// another point is this also that we define or not  the class as Generic but the type parameeter must be defined
// as in this case if we try to remove the typer before return type of method then we will get compilation error