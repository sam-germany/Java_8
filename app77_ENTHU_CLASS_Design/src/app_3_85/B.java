package app_3_85;
class A{
	
	A(){
		print();
	}
	
	 void print() {
		System.out.println("A"+"--");
	}
}
public class B extends A {

     int i= 10;
	
	public static void main(String[] args) {

		A a = new B();
		a.print();
	}
	void print() {
		System.out.println(i);
	
	}
	

}
