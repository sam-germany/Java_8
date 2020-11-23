package app_4_51;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {

		TreeSet<Integer> s1 = new TreeSet<>();  // as we are not using hier Collections.sort() method so no need  hier
		TreeSet<Integer> s2 = new TreeSet<>();  // it implement Comparator/Comparable
		
		for(int i = 1; i<=10; i++) {
			s1.add(i);
		}
		 
		s2 = (TreeSet) s1.subSet(2,true,8,true);
      //  s2.add(9);                                // it throw Runtime Exception
		s2.remove(2);
		System.out.println(s1+" "+ s2);
		
	
/*		s1.subSet(from Inclusive, to Inclusive)

   as we alloweed in   .subSet(from 2 till 8)     means alloweed values to add are between 2 - 8
		
  if we try to    s2.add(6)     this is ok but if we try   s2.add(9) this will throw exception		
*/		
	}

}
