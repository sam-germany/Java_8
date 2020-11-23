package app_2_16;

public class Test {
    private static final <X extends Integer, Y extends Integer> void add(X x, Y y) {
        System.out.println(x + y);
    }
 
    public static void main(String[] args) {
        add(10, 20);
    }
}

//  <X extends Integer>   if we use   type parameter like this then we we .add() anything like this