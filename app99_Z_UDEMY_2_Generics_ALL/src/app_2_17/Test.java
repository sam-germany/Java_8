package app_2_17;

public class Test <T>{

	T t;
	T [] obj;
	
	
	public Test() {
	
		// t = new T();
		
		//obj = new T[100];   // as we define <T>    T as type paramenter so we are not alloweed to create
	                          //                 objects or putting a value  into   Type parameter not alloweed
		
	}
	
	public T[] get1() {
		return obj;
	}
	
	public static void main(String[] args) {

	 Test<String> t = new Test<>();
	 String[] arr = t.get1();
	 System.out.println(arr.length);
	
	}

}
