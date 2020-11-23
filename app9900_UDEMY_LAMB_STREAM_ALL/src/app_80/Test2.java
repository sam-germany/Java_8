package app_80;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Fruit2 implements Comparator<Fruit2>{
	String name;
	String countryOfOrigin;
	
	
	Fruit2(){}
	public Fruit2(String name, String countryOfOrigin) {
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
	public int compare(Fruit2 o1, Fruit2 o2) {
		return o1.countryOfOrigin.compareTo(o2.countryOfOrigin);
	}
	
	public static int comp1(String s1, String s2) {
		return s2.compareToIgnoreCase(s1);
	} 
}
public class Test2 {
	public static void main(String[] args) {
		List<Fruit2> l = new ArrayList<>();
		
		l.add(new Fruit2("bb","22"));
		l.add(new Fruit2("cc","33"));
		l.add(new Fruit2("aa","11"));
		l.add(new Fruit2("dd","44"));
		l.add(new Fruit2("ee","55"));
		
		
		l.stream().sorted( Comparator.comparing(x -> x.countryOfOrigin, Fruit2::comp1))
		          .forEach(System.out::println);
		
	}

}