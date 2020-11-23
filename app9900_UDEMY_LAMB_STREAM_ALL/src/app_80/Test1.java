package app_80;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Fruit1 implements Comparator<Fruit1>{
	String name;
	String countryOfOrigin;
	
	
	Fruit1(){}
	public Fruit1(String name, String countryOfOrigin) {
		this.name = name;
		this.countryOfOrigin = countryOfOrigin;
	}
	
	@Override
	public String toString() {
		return name +" "+countryOfOrigin;
	}
	/*	
	@Override
	public int compareTo(Fruit1 o) {
		return this.name.compareToIgnoreCase(o.name);
	}
	*/
	public int compare(Fruit1 o1, Fruit1 o2) {
		return o1.countryOfOrigin.compareTo(o2.countryOfOrigin);
	}
	/*
	public static int comp1(String s1, String s2) {
		return s2.compareToIgnoreCase(s1);
	} */
}
public class Test1 {
	public static void main(String[] args) {
		List<Fruit1> l = new ArrayList<>();
		
		l.add(new Fruit1("bb","22"));
		l.add(new Fruit1("cc","33"));
		l.add(new Fruit1("aa","11"));
		l.add(new Fruit1("dd","44"));
		l.add(new Fruit1("ee","55"));
		
		l.stream().sorted(Comparator.comparing(f -> f.countryOfOrigin))
		          .forEach(System.out::println);
		
	
		
	}

}
