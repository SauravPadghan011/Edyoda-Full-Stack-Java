/*
 * Assignment-2
 * Question Number 1: Write a program to find the GCD of two numbers
 */



package Assignment2;
import java.util.Scanner;

public class GCD {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter Fist Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();
        int gcd;

        while(num1%num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }

        gcd = num2;
        System.out.println(gcd);
    }
}
