package app43_UDEMY_12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Counter implements Serializable {
    private static int count = 0;
    public Counter() {
        count++;
    }
 
    public static int getCount() {
        return count;
    }
}
 
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Counter ctr = new Counter();
        try( ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("D:\\Extra_Space_For_FOS\\Counter.dat")) ){
            oos.writeObject(ctr);
        }
 
        new Counter(); new Counter();
 
        try( ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("D:\\Extra_Space_For_FOS\\Counter.dat")) ){
            ctr = (Counter)ois.readObject();
            System.out.println(Counter.getCount());
        }
    }
}