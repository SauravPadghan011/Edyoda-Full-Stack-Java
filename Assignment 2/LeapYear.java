/*
 * Assignment-2
 * Question Number 1: Write a program to check if the given year is a Leap Year or not
 */


package Assignment2;
import java.util.*;

public class LeapYear {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int year = scan.nextInt();

        if(((year%4 == 0) && (year%100 != 0)) || (year%400 == 0))
            System.out.println(year + " is a leap year");
        else
            System.out.println(year + " is not a leap year");
    }
}
