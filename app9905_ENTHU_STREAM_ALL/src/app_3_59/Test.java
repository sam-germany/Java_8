package app_3_59;

import java.util.Optional;

public class Test {

	public static Optional<String> getGrade1(int marks){
		
		Optional<String>  op1 = Optional.empty();
		
		if(marks>50) {
			 op1 = Optional.of("Passm");
		}else {
			 op1.of("FAIL");              //      op1 = op1.of("FAIL");
		}                                 //      op1 = Optional.of("FAIL");
		return  op1;
	}
	
	public static void main(String[] args) {

		Optional<String> g1 = getGrade1(5);
		Optional<String> g2 = getGrade1(5);
		
		System.out.println(g1.orElse("sss--"));
		
		if(g2.isPresent()) {
			g2.ifPresent(x -> System.out.println(x));
		}else {
			System.out.println(g2.orElse("Empty---"));
		}
		
	}

}
