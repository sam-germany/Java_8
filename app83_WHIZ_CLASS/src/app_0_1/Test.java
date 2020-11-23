package app_0_1;

public class Test {

	static int i = 10;
	
	public   class Inner{
		public  void print() {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {

		Test t  = new Test();
		t.new Inner().print();
		
		
	}

}
