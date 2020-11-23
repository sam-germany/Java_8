package app_6_41;

import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {

		String str1 = Stream.iterate(1 ,  i -> i +1 )
				            .peek(System.out::println)
				            .limit(10)
				            .reduce("-", (i,s) -> i +s , (s1,s2) -> s1 + s2);
		
		System.out.println(str1);
		
		String str2  = Stream.iterate(1, i -> i +1)
				             .limit(10)
				             .parallel()
				             .reduce("-", (i,s) -> i + s,  (s1,s2)-> s1 + s2);
		
		System.out.println(str2);
	}}

/*  U reduce(U identity, BiFunction<U,? super T,U> accumulator, BinaryOperator<U> combiner)
 
    the main point is   the "accumulator"   will be applied in the begining and the "combiner"
    will be applied on the every element, if we just  draw this in mind then easy to understand
  
  
 (1)
  Note:  if we do not use   .limit(10)    after  .iterate()  method then the compiler will
          iterate   infinetly and it is iterating continuesly futher.
          
  (2)     if we replace for base    ""   into   "-"       then as the old examples hier
  aslo we get  str2  with a different output  
  
  (3) .reduce("", (i,s) -> i +s , (s1,s2) -> s1 +s2);
          
      (a)      this is  "accumulator"
              .reduce("", (i,s) -> i +s ,          
         
                 ("-", ("-",1) ->  "-" + 1)    output   "-1"        this will be called only once
      
      (b)    this is "combiner"
           (s1,s2) -> s1 +s2);
             
             ("-1",2   ->   "-1" +2 )        output   "-12"               after that on every element like 
             ("-12",3   ->  "-12" +3 )        output  "-123"                                                        this it will be applied
       
  
  
  
  as the .reudce() method applied on the parallel Strem so   "accumulator"  can be called on the
  "accumulator"   every time on  two three elements  all depends upon the execution on Threads.
  
  this is the case when we use .parallel() Stream
  if every element execute parallely 
  hier in this method  we have 2 steps     step 1    ("-", ("-",1) ->  "-" + 1)    output   "-"1
                                                     ("-", ("-",2) ->  "-" + 2)    output   "-"2
                                           
                                           step3   (s1,s2)   ->  s1 + s2      
                                                 ("-1","-2") -> "-1" + "-2"   output  "-1-2" 
                                                 
                                                  
                                                  
  
  
  
*/