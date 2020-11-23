package app_05_Lambda;



interface Operation {
    int operate(int x, int y);
}
 
public class Test {
    public static void main(String[] args) {

        
        Operation o1 = (a, b) -> a * b; 
        System.out.println(o1.operate(5, 10));
    }
}

