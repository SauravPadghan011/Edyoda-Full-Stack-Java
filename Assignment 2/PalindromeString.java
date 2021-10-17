/*
 * Assignment-2
 * Question Number 1: Write a program to check if the given string is a palindrome or not
 */



package Assignment2;
import java.util.*;

public class PalindromeString {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String oriString;
        StringBuilder reverseString = new StringBuilder();
        System.out.print("Enter the string: ");
        oriString = scan.nextLine();

        int length = oriString.length();
        for(int i=length-1; i >= 0; i--) {
            reverseString.append(oriString.charAt(i));
        }

//        System.out.println(reverseString);
        if(oriString.equalsIgnoreCase(reverseString.toString()))
            System.out.println("The string is Palindrome");
        else
            System.out.println("The string is not Palindrome");
    }
}
