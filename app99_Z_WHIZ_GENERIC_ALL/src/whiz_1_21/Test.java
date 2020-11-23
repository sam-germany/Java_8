package whiz_1_21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Dog{
	String name;
	String owner;
	int age;
	
	Dog(String n, String o, int a){
		name = n;
		owner =o;
		age = a;
	}
	
	@Override
	public String toString() {
		return owner;
	}
}
public class Test {
	
	
	 static class Sort1 implements Comparator<Dog>{
	     
		 @Override
		 public int compare(Dog first, Dog second) {
			return first.name.compareTo(second.name);
		}}
	
	static class Sort2 implements Comparator<Dog>{
		
		@Override
		public int compare(Dog first, Dog second) {
			return first.owner.compareTo(second.owner);
		}}
	
	public static void main(String[] args) {

		ArrayList<Dog> dogList = new ArrayList<>();
		dogList.add(new Dog("Lazy", "John",3));
		dogList.add(new Dog("White", "Herry",2));
		dogList.add(new Dog("Blacky", "Bert",5));
		dogList.add(new Dog("Tanzan", "Jack",1));
	
	        
		  Test.Sort1 s1 = new Test.Sort1();
	      Collections.sort(dogList, s1);                   // Collections.sort( list, comparator)
	      System.out.println(dogList);
	
	      Test.Sort2 s2 =new Test.Sort2();
	        Collections.sort(dogList, s2);
        	 System.out.println(dogList);
	}
	

	
}
