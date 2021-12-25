/*
* Program to implement cloneable interface
* */


package edyoda.Assignment3;
import java.util.Scanner;

public class CloneableInterface implements Cloneable{

    private String firstName;
    private String lastName;
    int age;

    private CloneableInterface (String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    private void print() {
        System.out.println("\nFirst Name: " + firstName + "\nLast Name: "+ lastName + "\nAge: "+age);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


    public static void main(String[] args) throws CloneNotSupportedException {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = scan.nextLine();
        System.out.print("Enter Last Name: ");
        String lastName = scan.nextLine();
        System.out.print("Enter Age: ");
        int age = scan.nextInt();

        CloneableInterface obj1 = new CloneableInterface(firstName, lastName, age);     // Original class object
        CloneableInterface obj2 = (CloneableInterface) obj1.clone();                    // cloning object 1

        obj1.print();
        obj2.print();
    }
}
