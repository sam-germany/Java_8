package app_70;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		String text = "a b c d";
		
		Stream<String> s1 = Arrays.stream(text.split("-"));
		
		IntSummaryStatistics stat = s1.mapToInt(s -> s.length())
				                      .summaryStatistics();
		
		
		System.out.println(stat);
		
		System.out.println(stat.getMax());
	}

}
