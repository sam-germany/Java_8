package app_0_2;

import java.util.Arrays;

enum A{
	HIGH(1), MEDIUM(6), LOW(3);

 private final int level;
 
   private A(int x) {
	 level= x;
 }
}
public class Test2 {

	public static void main(String[] args) {

		
		A []a = {A.HIGH,A.MEDIUM,A.LOW};
		
		Arrays.sort(a);
		
		System.out.println(a[1]);
	}

}
