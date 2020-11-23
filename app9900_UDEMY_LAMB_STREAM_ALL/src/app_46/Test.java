package app_46;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List<String> l = new ArrayList<>();
		
		System.out.println(l.stream().anyMatch(s -> s.length() > 0));
		
		System.err.println(l.stream().allMatch(s -> s.length() > 0));
		
		System.out.println(l.stream().noneMatch(s -> s.length() > 0));
		
	}

}
