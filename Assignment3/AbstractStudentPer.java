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
