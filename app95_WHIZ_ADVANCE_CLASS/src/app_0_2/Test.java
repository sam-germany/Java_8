package app_0_2;

public class Test {

	static int  y = 10;

	public static void main(String[] args) {
		
		abstract class A{
		public abstract int add1(int x);	
		}
		
		A a = new A() {
			public int add1(int x) {
				return x+y;
			}
		};
		
		System.out.println(a.add1(2));
		
	}

}
