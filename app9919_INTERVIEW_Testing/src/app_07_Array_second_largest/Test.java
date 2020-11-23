package app_07_Array_second_largest;

public class Test {

	public static int m1(int array[]) {
		
		int highest = Integer.MIN_VALUE;
		int secondHighest  = Integer.MIN_VALUE;
		
	     	for(int i=0; i<array.length; i++) {
			
		         	if( array[i] > highest) {
				
				        secondHighest = highest;
          				highest = array[i];
			
		         }else if(array[i] > secondHighest && array[i] !=highest) {
			                         	secondHighest = array[i];
			                               }
		                 }
	     	
      return secondHighest;		
	}
	
	public static void main(String[] args) {

		int[] arr1 = {7,5,6,8,4,2};
		
		int secondLargest = m1(arr1);
		
		System.out.println(secondLargest);
	}

}
