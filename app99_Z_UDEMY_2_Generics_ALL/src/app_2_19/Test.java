package app_2_19;

import java.util.ArrayList;
import java.util.List;

abstract class Animal {}
class Dog extends Animal{}
 
public class Test {
    public static void main(String [] args) {
    	
        List<Animal> l = new ArrayList<>();
        l.add(0, new Dog());                      // another point  as List<Animal>  list is of Animal type
        System.out.println(l.size() > 0);         // the subclasses of Animal we can pass it hier.
        
    }
}