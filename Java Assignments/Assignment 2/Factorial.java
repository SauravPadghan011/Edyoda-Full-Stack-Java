/*
 * Assignment-2
 * Question Number 1: Write a program to find the factorial using loop and recursion
 */



package Assignment2;
import java.util.*;

public class Factorial {
    static Scanner scan = new Scanner(System.in);
    static Factorial obj = new Factorial();

    // Factorial using loop
    public int usingLoop(int num) {
        int fact=1;
        for(int i=num; i>=1; i--) {
            fact *= i;
        }
        return fact;
    }

    // Factorial using recursion
    public int usingRecursion(int num) {
        if(num>=1)
            return num*usingRecursion(num-1);
        else
            return 1;
    }

    public static void main(String[] args) {
        System.out.print("1. Using Loop\n2. Using Recursion\nEnter Choice: ");
        int opt = scan.nextInt();
        System.out.print("Enter Number: ");
        int num = scan.nextInt();

        switch(opt) {
            case 1 -> System.out.println(num+"! = "+ obj.usingLoop(num));
            case 2 -> System.out.println(num+"! = "+ obj.usingRecursion(num));
            default -> System.out.println("Invalid Choice!!");
        }
    }
}
