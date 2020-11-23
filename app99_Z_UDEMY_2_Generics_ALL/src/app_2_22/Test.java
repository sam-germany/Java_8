package app_2_22;

interface Operator<T>{
	public abstract T opr1(T t1, T t2);         // as we define a  abstract() method so we can call Lambda on it
}
public class Test {
	public static void main(String[] args) {

		
		Operator<String> x = (s1,s2) -> s1 +s2;
		
		System.out.println(x.opr1("A", "b"));
		
		
		
		
		System.out.println((Operator<String>)(s1,s2)-> s1 + s2);
		// this is not so good output but we can use it like this
		
		
		
		// anonymous inner class		
 System.out.println(new Operator<String>() {
	                          
	                           public String opr1(String s1, String s2) {
                               	                return s1 + s2;
	                                                    }
	                                      });
	}

}
