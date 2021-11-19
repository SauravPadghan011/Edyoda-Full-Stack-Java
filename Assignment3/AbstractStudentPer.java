/*
* We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A
* and in four subjects (each out of 100) by student B.
* Create an abstract class 'Marks' with an abstract method 'getPercentage'.
* It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students.
* The constructor of student A takes the marks in three subjects as its parameters
* and the marks in four subjects as its parameters for student B. Create an object for eac of the two classes
* and print the percentage of marks for both the students.
 * */

package edyoda.Assignment3;


abstract class Marks{
    abstract double getPercentage();
}

class A extends Marks{
    private int sub1, sub2, sub3;

    A(int sub1, int sub2, int sub3) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
    }

    @Override
    double getPercentage() {
        return ((sub1 + sub2 + sub3)*100.0)/300.0;
    }
}

class B extends Marks{
    private int sub1, sub2, sub3, sub4;

    B(int sub1, int sub2, int sub3, int sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }

    @Override
    double getPercentage() {
        return ((sub1 + sub2 + sub3 + sub4)*100.0)/400.0;
    }
}


public class AbstractStudentPer {
    public static void main(String[] args) {
        A objA = new A(90, 84, 72);
        B objB = new B(74, 87, 86, 62);

        double per1 = objA.getPercentage();
        double per2 = objB.getPercentage();

        System.out.println("Percentage of student A : " + per1);
        System.out.println("Percentage of student B : " + per2);
    }
}
