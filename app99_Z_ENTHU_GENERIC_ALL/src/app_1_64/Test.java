package app_1_64;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test implements Comparable<Test> {

	String name;
	int calories;
	public Test(String name, int calories) {
		this.name = name;
		this.calories = calories;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCalories() {
		return calories;
	}
	public void setCalories(int calories) {
		this.calories = calories;
	}
	
	@Override
	public String toString() {
		return name +" "+ calories;
	}

	public int compareTo(Test o) {
	
		return this.name.compareTo(o.name);
	}

	public static void main(String[] args) {

		List<Test> al = new ArrayList<>();
		al.add(new Test("bb",22));
		al.add(new Test("aa",11));
		
	    Collections.sort(al);// if we put as argument only list then we need to implement Comparable (I) 
		System.out.println(al);
		
		
	//	Collections.sort(al, (p1,p2) -> p1.name.compareTo(p2.name));
	
		// if we put comparable as a second argument in the sort() method then we do not need to implement 
	    //                                                           comparable (I) in this application
	
	}

	
}
