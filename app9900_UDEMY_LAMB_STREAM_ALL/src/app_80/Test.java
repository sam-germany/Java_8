package app_80;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Fruit implements Comparator<Fruit> {
	String name;
	String countryOfOrigin;
	
	
	Fruit(){}
	public Fruit(String name, String countryOfOrigin) {
		super();
		this.name = name;
		this.countryOfOrigin = countryOfOrigin;
	}
	
	@Override
	public String toString() {
		return name +" "+countryOfOrigin;
	}
	/*
	@Override
	public int compareTo(Fruit o) {
		return this.name.compareToIgnoreCase(o.name);
	}
*/	
	@Override
	public int compare(Fruit o1, Fruit o2) {
		return o1.countryOfOrigin.compareTo(o2.countryOfOrigin);
	}
	/*	
	public static int comp(String s1, String s2) {
		return s2.compareToIgnoreCase(s1);
	} */
}
public class Test {
	public static void main(String[] args) {

		List<Fruit> l = new ArrayList<>();
		l.add(new Fruit("aa","11"));
		l.add(new Fruit("bb","22"));
		l.add(new Fruit("cc","33"));
		l.add(new Fruit("dd","44"));
		l.add(new Fruit("ee","55"));
		
// case 1
		l.stream().sorted( new Fruit() )
	             .forEach(System.out::println);
		
// case 2		
		l.stream().sorted( new Fruit().reversed() )
                  .forEach(System.out::println);

	}

}
