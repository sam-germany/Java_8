package app_16_Odd_Even;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
	    int x;
	    System.out.println("Enter an integer to check if it's odd or even");
	    Scanner in = new Scanner(System.in);
	    x = in.nextInt();

	    if (x % 2 == 0)
	      System.out.println("The number is even.");
	    else
	      System.out.println("The number is odd.");
	  }
	}

