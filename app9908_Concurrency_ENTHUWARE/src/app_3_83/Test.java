package app_3_83;

import java.util.concurrent.locks.ReentrantLock;

public class Test {

	public static void main(String[] args) {

		ReentrantLock r1 = new ReentrantLock();
		
		boolean f1 = r1.tryLock();
		
		System.out.println(f1);
		
		
	}

}//  ReentrantLock.lock();     public void lock();        return type is void for  .lock() method.
