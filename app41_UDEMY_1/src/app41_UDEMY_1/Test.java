package app41_UDEMY_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;

public class Test {
    public static void main(String[] args) throws IOException {
        System.setOut(new PrintStream("F:\\err.log"));
        try {
            System.out.println("ONE");
            System.out.println(1 / 0);
        } catch (ArithmeticException e) {
            System.err.println("TWO");
            
            System.out.println("TWO");
            
        }
    }
}