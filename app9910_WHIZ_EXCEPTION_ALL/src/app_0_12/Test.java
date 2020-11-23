package app_0_12;

import java.io.Console;
import java.io.IOException;

class NotInRangeException extends IOException{
	NotInRangeException(){
		super("Not in valid Range");
	}
}

class Employee{
	int age;
	
	public boolean setAge1(int ae) throws NotInRangeException{
		
		if(ae< 18 || ae > 60) {
			throw new NotInRangeException();
		}else {
			age = ae;
			return true;
		}
	}
}
public class Test {
	public static void main(String[] args) throws NotInRangeException {

		
		Employee d = new Employee();
		d.setAge1(65);
		
		System.out.println(d.age);
	}

}
