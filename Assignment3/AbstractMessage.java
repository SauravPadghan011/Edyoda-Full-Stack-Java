/*
 * Create an abstract class 'Parent' with a method 'message'.
 * It has two subclasses each having a method with the same name 'message' that prints "This is first subclass"
 * and "This is second subclass" respectively. Call the methods 'message' by creating an object for each subclass.
 * */

package edyoda.Assignment3;


abstract class Parent {
    abstract void message();
}

class Subclass1 extends Parent {

    @Override
    void message() {
        System.out.println("This is first subclass");
    }
}

class Subclass2 extends Parent {

    @Override
    void message() {
        System.out.println("This is Second subclass.");
    }
}

public class AbstractMessage {
    public static void main(String[] args) {
        Subclass1 objSub1 = new Subclass1();
        Subclass2 objSub2 = new Subclass2();

        objSub1.message();
        objSub2.message();
    }
}
