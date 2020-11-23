package app_85;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Certification{
	String studId;
	String test;
	int marks;

	public Certification(String studId, String test, int marks) {
		this.studId = studId;
		this.test = test;
		this.marks = marks;
	}
	public String getStudId() {
		return studId;
	}
	public String getTest() {
		return test;
	}
	public int getMarks() {
		return marks;
	}
	@Override
	public String toString() {
		return studId +" "+test+" "+marks;
	}}
public class Test {
	public static void main(String[] args) {

	Certification c1 = new Certification("aa","oaa",1);
	Certification c2 = new Certification("cc","occ",3);
	Certification c3 = new Certification("bb","obb",2);
	Certification c4 = new Certification("dd","oaa",4);
		
	Stream<Certification> s = Stream.of(c1,c2,c3,c4);
	
	Map<Boolean, List<Certification>> map = 
			                        s.collect(Collectors.partitioningBy(x -> x.getTest().equals("oaa")));
	
	System.out.println(map.get(true));
	System.out.println(map.get(false));
	
		
	}

}
