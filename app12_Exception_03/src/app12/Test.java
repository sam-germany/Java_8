package app12;

import java.util.Optional;


class LostBallException extends Exception {}

public class Test {
	
	public void toss() throws LostBallException{
		throw new ArrayStoreException();
	}

	public static void main(String[] args) {

		try {
		 new Test().toss();	
		} catch (Throwable e) {
             System.out.println("Caught it");
		
		}
		
		
		}
	}


