package appp_103;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
       
		
		List<Integer> list = Arrays.asList(-80, 100, -40, 25, 200);
        Predicate<Integer> predicate = num -> {
            int ctr = 1;
            boolean result = num > 0;
            System.out.print(ctr++ + ".");
            return result;
        };
 
        System.out.println(  list.stream().filter(predicate).count()   );
    }
}


//   as .filter()   Predicate method return false for   -80 ,-40  so they will not added in the count