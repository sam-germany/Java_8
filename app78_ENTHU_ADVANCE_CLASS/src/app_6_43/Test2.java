package app_6_43;

interface A{
	int value = 1;
	void m1();
}

interface B {
	int value  = 2;
	void m1();
}
public class Test2  implements A, B{

	public void m1() {
		System.out.println("Hello all");
	}
	public static void main(String[] args) {

		Test2 t  = new Test2();
		t.m1();                 // prints hello all
	
		((A)t).m1();     // prints hello all
		
		((B)t).m1();  // prints hello all
		
		
		
	}

}
