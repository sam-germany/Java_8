package app_2_11;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

class A<T>{
	T t;
	
	void set1(T t) {
		this.t = t;
	}
	
	T get1() {
		return t;
	}}                                                           // Note: we are using <T extends Animal>
public class Test {                                              // we are not using    <? extends Animal>
                                                                 // when we use <? extends >  means not alloweed 
/*	public static <T> void print1(A <T extends Animal> obj) {    // to .add() anything but hier we are using
		obj.set1(new Dog());                                     // <T extends Animal> so we are alloweed to .add()
		System.out.println(obj.get1().getClass());                // but 2 classes extends Animal so compile is not
	}                                                             // sure what exactelly we are adding.
*/	
	
	public static <T> void print2(A < ? super Dog> obj) {
		obj.set1(new Dog());
//		obj.set1(new Animal());                             // this line will not work as compile do not know which
		System.out.println( obj.get1().getClass());         // <? super Dog>  about which super class of Dog
	}                                                        // we want to .add();
	
	public static void main(String[] args) {
	
	A<Dog> obj = new A<>();
//	print1(obj);
	
	print2(obj);
	
	
	
}

}