package app_09_Prime_number;

import java.util.Scanner;

public class Test {
	   public static void main(String[] args) {
		   
		    int i=0;
		    int m=0;
		    int flag=0;

		    Scanner sc  = new Scanner(System.in);
		   System.out.println("Enter a Number :");
		   
		   int n = sc.nextInt();

		       m=n/2;      
		       System.out.println(m);
		   
		     if(n==0||n==1){  
		      System.out.println(n+" is not prime number---");      
		      
		     }else{  
		   
		    	  for(i=2; i<=m; i++){      
		           if(n%i==0){      
		          System.out.println(n+" is not prime number===");      
		          flag=1;      
		      break;      
		                     }      
		                         }// for loop  ends hier
		    	  
		     if(flag==0)  { System.out.println(n+" is prime number"); }  
		   
		           }//end of else  
}    
}   