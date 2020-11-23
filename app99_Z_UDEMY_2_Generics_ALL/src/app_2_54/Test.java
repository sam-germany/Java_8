package app_2_54;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		String[] arr = {"+++","+","+++++","++"};
		
		Arrays.sort(arr, (s1,s2)-> s1.length() - s2.length());   //assending order , directly by 
		                                                         //   using Lambda Expression
		for(String s : arr) {
			System.out.println(s);
		}
		
		
		System.out.println("------------");
		
		
		Arrays.sort(arr, (s1,s2)-> s2.length() - s1.length());     //dessending order
		for(String s : arr) {
			System.out.println(s);
			
			
		System.out.println("-------------");
		
		System.out.println(arr); //  as we use  String[]  Array  so we must use for() loop to retrive the values
			
			
		}}}

// Note:  the main point is  Arrays.sort()  the sorted condition will reflect on the     String  [] arr  Array
