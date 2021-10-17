/*
 * Assignment-2
 * Question Number 1: Write a program to check if the given number is odd or even
 */

package Assignment2;
import java.util.*;

public class EvenOdd {
    static Scanner scan = new Scanner(System.in);

    public boolean evenOddFunction(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();
        System.out.print("Enter a number: ");
        int num = scan.nextInt();

        if(obj.evenOddFunction(num))
            System.out.println("Number is Even");
        else
            System.out.println("Number is Odd");
    }
}
