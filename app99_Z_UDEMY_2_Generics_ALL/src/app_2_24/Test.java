package app_2_24;

public class Test<T> {

	private T t;
	
	public T get1() {
		return t;
	}
	
	
	public void set1(T t) {
		this.t = t ;
	}
	
	public static void main(String[] args) {

		Test obj = new Test();
		obj.set1("ocp");
		obj.set1(85);
		obj.set1("%");
		
		
		System.out.println(obj.get1());
	}

}
// read explanation easy to understand