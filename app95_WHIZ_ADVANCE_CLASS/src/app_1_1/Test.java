package app_1_1;

public class Test {

	class Test1{
		private int x  = 1;
		
		public void in() {
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {

		Test.Test1 t = new Test().new Test1();
	               t.x =2;
	            	t.in();
		
		
		
	}

}
