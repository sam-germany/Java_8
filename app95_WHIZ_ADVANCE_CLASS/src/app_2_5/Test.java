package app_2_5;

public class Test {

	static int y= 1;
	
	public static void main(String[] args) {

		abstract class A{
			public abstract int c1(int x);
		}
		
		A a = new A() {
			public int c1(int x) {
				return x + y;
			}
			
			public void print(int x ) {
				System.out.println(c1(x)+ "---");
			}
		};
		System.out.println(a.c1(2)+ "===");
	}

}
