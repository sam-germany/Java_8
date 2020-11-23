package app_2_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class NegativeException extends RuntimeException{ }

class NotEnoughException extends Exception{ }

class Lone{
	int amount;
	public boolean setAmount(int am) throws NotEnoughException{

		if(am < 0) {
			throw new NegativeException();
		}else if( am < 500){
			throw new NegativeException();
		}else {
			amount = am;
			return true;
		}
	}}
public class Test {
	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Lone d = new Lone();
		
		System.out.println("Enter the amount  ");
		
		try {
			int i = Integer.parseInt(br.readLine());
			d.setAmount(i);
		}catch(NegativeException e) {
			System.out.println(e);
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println(d.amount);
			
	}

}
