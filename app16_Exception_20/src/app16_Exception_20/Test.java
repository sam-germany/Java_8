package app16_Exception_20;

public class Test {

	private int score;
	
	public Test() {
		super();
		Test.this.score = 5;
	}
	
	public static void main(String[] args) {

		final Test t = new Test();
		assert (t.score > 2): t.score++;
//		assert t.score >=5  : System.out.print(" Noooooooooo");
	   
		 System.out.println("MAde it");
	}

}
