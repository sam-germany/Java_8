package app_1_58;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Names{
	
	private List<String> ls1;
	
	public void setList1(List<String> ls1) {
		this.ls1 = ls1;
	}
	
	public List<String> getList1(){
		return ls1;
	}
	
	public void printNames1() {
		System.out.println(getList1());
	}
}
public class Test {
	public static void main(String[] args) {

		List<String> l = Arrays.asList(
				                          "Bob Hope",
				                          "Bob Dole",
				                          "Bob Brown"
				                            );
		
		Names n = new Names();
		n.setList1(l.stream().collect(Collectors.toList()));
		n.printNames1();
		
		
	}

}
