package app_99;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

enum Color{
	RED,YELLOW, GREEN
}

class TraficLight{
	String msg;
	Color color;

	public TraficLight(String msg, Color color) {
		this.msg = msg;
		this.color = color;
	}
	public String getMsg() {
		return msg;
	}
	public Color getColor() {
		return color;
	}

	@Override
	public String toString() {
		return color +" "+msg;
	}
}
public class Test {
	public static void main(String[] args) {

		TraficLight t1 = new TraficLight("Go",      Color.GREEN);
		TraficLight t2 = new TraficLight("Go Now",  Color.GREEN);
		TraficLight t3 = new TraficLight("Ready ",  Color.YELLOW);
		TraficLight t4 = new TraficLight("Slow Now",Color.YELLOW);
		TraficLight t5 = new TraficLight("stop",    Color.RED);
		
		List<TraficLight> l = Arrays.asList(t1,t2,t3,t4,t5);
		
// case 1	it is norall type as till now i done 	
    Map<Color, List<TraficLight>> map = l.stream()
                                         .collect(Collectors.groupingBy(TraficLight::getColor));
		
	    System.out.println(map.get(Color.YELLOW));	                              
		
	    
	    
	    Map<Color, List<String>> map2 = 
		        l.stream().collect(Collectors.groupingBy(TraficLight::getColor,
		        		      Collectors.mapping(TraficLight::getMsg, Collectors.toList()))
		        		          );
	
	    
	    System.out.print(map2.get(Color.YELLOW));
	}

}
