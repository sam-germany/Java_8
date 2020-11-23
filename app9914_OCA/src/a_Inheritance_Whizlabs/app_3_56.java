package a_Inheritance_Whizlabs;

class MainClass{
	MainClass(){
		System.out.println("Main class");
	}
}

class SubClass extends MainClass{
	{
		System.out.println("!");
	}
	
	static {
		System.out.println("S");
	}
	
	SubClass(int i){
		this();
		System.out.println("Subclass---");
	}
	
	
	SubClass(){
		super();
		System.out.println("SubClass");
	}
}

class SubSubClass extends SubClass{
	SubSubClass(String s){
		super();
		System.out.println("SubSubClass");
	}
	
	static { System.out.println("---");}
}

public class app_3_56 {
	public static void main(String[] args) {

		new SubSubClass("ABC");
		
	}

}
