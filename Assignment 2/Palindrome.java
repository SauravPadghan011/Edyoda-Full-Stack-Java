/*
 * Assignment-2
 * Question Number 1: Write a program to check if an inputted number is a palindrome or not
 */


package Assignment2;
import java.util.*;

public class Palindrome {
    static Scanner scan = new Scanner(System.in);
    static Palindrome obj = new Palindrome();

    // Method to get the number of digit in number
    public int countDigit(int num) {
        int count = 0;
        while(num>0) {
            num/=10;
            count++;
        }
        return count;
    }

    // Method to reverse the number
    public int reverseNumber(int num) {
        int result = 0;
        while(num>0) {
            int count = obj.countDigit(num);
            int lastDigit = num%10;
            result = result + lastDigit*(int)Math.pow(10,(count-1));
            num /= 10;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.print("Enter Number: ");
        int num = scan.nextInt();

        int result = obj.reverseNumber(num);
        if(result == num)
            System.out.println(num+" is Palindrome");
        else
            System.out.println(num+" is not a Palindrome ");
    }
}
