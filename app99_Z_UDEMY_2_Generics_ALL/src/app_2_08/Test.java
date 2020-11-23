package app_2_08;

class Printer<T extends Cloneable> {}

public class Test {
    public static void main(String[] args) {
 //       Printer<Integer> printer = new Printer<>();
 //       System.out.println(printer);
    }
}
// as  String does not extends from Coloneable so this code will not compile