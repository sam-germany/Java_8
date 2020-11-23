package app_2_39;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class Test {

	public<E extends CharSequence> Collection <E>   get222(Collection<E> input, char ch){
		
		
		Collection<E> returnValue = new ArrayList <>();
		
		for(E e : input) {
			if(e.charAt(0) == ch)  returnValue.add(e);
		}
		
		System.out.println(returnValue);
		
      return returnValue;
	}
	
	public void checkIt22() {
		List<String> a1 = new ArrayList<>();
		a1.add("apple");
		a1.add("Cherry");
		
		Set<StringBuffer> b2 = new HashSet<>();
		b2.add(new StringBuffer("pineapple"));
		
		    Collection<String>   ac = get222(a1,'a');        // the returned value stored in  ac, bc is not
		Collection<StringBuffer> bc = get222(b2,'b');        // used in this code.
				
	}
	public static void main(String[] args) {

		new Test().checkIt22();
		
		
		
}}


