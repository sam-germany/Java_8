package app_2_43;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {

 
	public static void main(String[] args) {
		
        Set<String> set = new HashSet<>(Arrays.asList(null,null,null));
        long count = set.stream().count();
        System.out.println(count);
        
        System.out.println(set);
    }
}

