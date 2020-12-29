import java.io.*;

class A {
    protected int field;

    A() { System.out.println("A::Default Constructor"); }

    A(int i) {
        this.field = i;
        System.out.println("A::Parameter Constructor");
    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return String.format("A [field=%s]", field);
    }

}

class B extends A implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -6197736672294431667L;
    protected int field;

    B() {
        System.out.println("B::Default Constructor");
    }

    B(int i) {
        this.field = i;
        System.out.println("B::Parameter Constructor " + field);
    }

    @Override
    public String toString() {
        return String.format("B [field=%s]", field);
    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

}



public class ChildDeseralization {

    public static void main(String args[]) throws FileNotFoundException,
            IOException, ClassNotFoundException {
        File file = new File("d:\\session.txt");
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(file));
        B writeChild = new B();
        out.writeObject(writeChild);
        out.close();
        System.out.println("===========Restore Object By Deserialization ==============");
        ObjectInput input = new ObjectInputStream(new FileInputStream(file));
        B readB = (B) input.readObject();
        System.out.println(readB.getField());
        input.close();
    }
}
/*
Output here :-

    A::Default Constructor
    B::Default Constructor
    ===========Restore Object By Deserialization ==============
    A::Default Constructor
    0

Next, What will happen if Parent class “A” implements “Serializable” interface then Output should
be like :-

    A::Default Constructor
    B::Default Constructor
    ===========Restore Object By Deserialization ==============
    0
-------------------------------------------------------------------------------------------------
The output difference clearly said that during deserialization, non-serialization class
No-Arg constructor gets invoked. In the second scenario output
 (  if Parent class “A” implements “Serializable” ), recursively default constructor will
 call upto base class or Object Class until JVM Compiler gets to know which class doesn’t
 implement Serialization interface so Default constructor will call to that class.


Deserialization doesn’t invoke the constructor because the purpose of it is to express the
state of the object as it was serialized, running constructor code could interfere with that.
 */