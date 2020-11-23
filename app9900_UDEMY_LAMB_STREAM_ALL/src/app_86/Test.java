package app_86;

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
      
      @Override
    public String toString() {
    	return  studId +" "+ test+" "+marks;
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
}
public class Test {
	public static void main(String[] args) {
		    Certification c1 = new Certification("S001", "OCA", 87);
	        Certification c2 = new Certification("S002", "OCA", 82);
	        Certification c3 = new Certification("S001", "OCP", 79);
	        
	        Stream<Certification> s = Stream.of(c1,c2,c3);
		
	        Map<String, List<Certification>> map = 
	        		            s.collect(Collectors.groupingBy(Certification::getTest));
	                 
	        
	        System.out.println(map.get("OCP"));
	        
	      // Case 2
//	        Map<String, List<Certification>> map = 
//		                                         s.collect(Collectors.groupingBy(x -> x.getTest()));
	}

}
