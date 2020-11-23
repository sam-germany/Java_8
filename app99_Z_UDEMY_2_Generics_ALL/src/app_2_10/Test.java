package app_2_10;

public class Test {
    public static <T> T get1(T t) {
        return t;
    }
 
    public static void main(String[] args) {
        String str = get1("HELLO");
        System.out.println(str);
    
      
        Integer i = get1(100);
        System.out.println(i);
    
    }
}