package app_2_01;

class T {
    @Override
    public String toString() {
        return "T";
    }
}
 
class Printer<T> {
    private T t;
    Printer(T t){
        this.t = t;
    }
    @Override
    public String toString(){
        return "----";         //  t.toString();   we replaced with  "----"  this it means Printer class   
    }                           //                toString() is first called after that from hier the
}                               //                T class   t.toString()  will be called.
 
public class Test {
    public static void main(String[] args) {
        Printer<T> obj = new Printer<>(new T());
        System.out.println(obj);
    }
}