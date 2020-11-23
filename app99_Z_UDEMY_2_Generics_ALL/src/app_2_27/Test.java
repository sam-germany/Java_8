package app_2_27;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {
		
		
	       List<String> list = Arrays.asList("T", "S", "R", "I", "F");
	    
	       ListIterator<String> iter = list.listIterator(5);
	       
	            while(iter.hasPrevious()) {
	                      System.out.print(iter.previous());
	                           }
	    }
	}
/*
listIterator(index); method allows to have the starting point at any index. 
Allowed values are between 0 and size of the list.

ListIterator<String> iter = list.listIterator(6);

as if we put   6  hier then it is above the size of list so at run time we will
get exception easy to understand.




*/