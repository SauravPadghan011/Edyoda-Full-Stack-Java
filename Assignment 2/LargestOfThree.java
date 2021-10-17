/*
 * Assignment-2
 * Question Number 1: Write a program to find the greatest of 3 inputted numbers
 */


package Assignment2;
import java.util.*;

public class LargestOfThree {
    static Scanner scan = new Scanner(System.in);

    public int largest(int num1, int num2, int num3) {
        if((num1>num2) && (num1>num3))
            return num1;
        else if ((num2>num1) && (num2>num3))
            return num2;
        return num3;
    }

    public static void main(String[] args) {
        LargestOfThree obj = new LargestOfThree();

        int num1, num2, num3;
        System.out.print("Enter First Number: ");
        num1 = scan.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = scan.nextInt();
        System.out.print("Enter Third Number: ");
        num3 = scan.nextInt();

        System.out.println("Largest: " + obj.largest(num1, num2, num3));
    }
}
