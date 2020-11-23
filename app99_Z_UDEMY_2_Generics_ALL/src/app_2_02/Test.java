package app_2_02;


class Printer<String> {
    private String t;
    Printer(String t){
        this.t = t;
    }
}
 
public class Test {
    public static void main(String[] args) {
        Printer<Integer> obj = new Printer<>(100);
        System.out.println(obj);
    }
}

//  Note:  hier      class     Printer<String> {   it does not means that  Printer class
//   will take only   Printer<String> {}  <String>  as parameter but hier it will   

// it wil work like this   class Printer<String> {}  means   class Printer<T> {}
 
// this is the reaso why   new Printer<>(100);     (100)    is working eventough we deinfed <String>