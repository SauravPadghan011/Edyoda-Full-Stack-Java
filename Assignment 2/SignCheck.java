/*
 * Assignment-2
 * Question Number 1: Check if two integers are of opposite signs
 */


package Assignment2;
import java.util.*;

public class SignCheck {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int num1, num2;
        System.out.print("Enter the number 1: ");
        num1 = scan.nextInt();
        System.out.print("Enter the number 2: ");
        num2 = scan.nextInt();

        if((num1>0 && num2>0) || (num1<0 && num2<0))
            System.out.println("Integers are of same signs");
        else
            System.out.println("Integers are of opposite signs");

    }
}
