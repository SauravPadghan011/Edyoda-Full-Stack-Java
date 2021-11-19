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
