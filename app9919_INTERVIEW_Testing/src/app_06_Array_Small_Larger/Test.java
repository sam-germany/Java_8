package app_06_Array_Small_Larger;

public class Test {

	public static void main(String[] args) {

		int  [] arr = new int []{ 1200, 2, 76, 89, 10, 99, 21, 34};
		
		
		int smallest = arr[0];  //12     as  0_th  index is  12 for both
		int  largest = arr[0];   //12
		

		
		for(int i=1; i<arr.length; i++) {
			
			if(arr[i] > largest) { 
				largest = arr[i];
				System.out.println(largest+ "---");
				
			}else if(arr[i]< smallest) {
				smallest = arr[i];
				System.out.println(smallest+ "===");
			        }
		   }
	
		System.out.println(smallest);
		System.out.println(largest);
	
	}}
/* just draw in mind easy to understand.

as we are again putting a condition in   else if( boolean ){}      so we can not 
put only else{}  hier  if we do not use and  boolean  in else if() part then
we can use else{}  their.  

*/
