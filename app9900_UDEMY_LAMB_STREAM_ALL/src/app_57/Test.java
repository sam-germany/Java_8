package app_57;

import java.util.ArrayList;
import java.util.List;

class Rope{
	int length;
	String color;

	public Rope(int length, String color) {
		this.length = length;
		this.color = color;
	}
    @Override
    public String toString() {
    	return  color+" "+ length;
    }

                    static class Rope2{
                    	boolean fileter3(Rope r) {
                    		return  r.color.equalsIgnoreCase("Red");
                    	}
                    }
}
public class Test {
	public static void main(String[] args) {
      
		List<Rope> l = new ArrayList<>();
		l.add(new Rope(5,"red"));
		l.add(new Rope(10,"Red"));
		l.add(new Rope(7,"RED"));
		l.add(new Rope(10,"green"));
		l.add(new Rope(7,"Blue"));
		
		l.stream().filter(new Rope.Rope2()::fileter3).forEach(System.out::println);
		
		l.stream().filter( (Rope x)-> new Rope.Rope2().fileter3(x)  ).forEach(System.out::println);
		
	}

}
