package app_1_13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class NotInRangeException extends IOException{ }

class Employee{
     int age;
    
     public boolean setAge(int ae) throws NotInRangeException{
    	 
    	 if(ae <18 || ae >60) {
    		 throw new NotInRangeException();
    	 
    	 }else {
    		 age = ae;
    		 return true;
    	 }
     }
}
public class Test {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Employee d = new Employee();
		
		System.out.println("Enter the age  ");
		
		try {
			br.readLine();
			d.setAge(5);
		}catch(NotInRangeException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
				
		
	}

}
