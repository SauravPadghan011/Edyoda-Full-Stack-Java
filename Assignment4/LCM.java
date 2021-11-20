/*
* Write a program to find the LCM of 3 numbers and throw exception if any of the given numbers is negative
 * */


package edyoda.Assignment4;
import java.util.Scanner;

public class LCM {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        LCM obj = new LCM();

        System.out.print("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter Third Number: ");
        int num3 = sc.nextInt();


        if(num1<0 || num2<0 || num3<0) {
            throw new Exception("Negative Number!!");
        } else {
            int lcm3Num = obj.findLCM(obj.findLCM(num1, num2), num3);
            System.out.println("LCM of " + num1 + ", " + num2 + " and " + num3 + " is " + lcm3Num);
        }
    }

    public int findLCM(int num1, int num2) {
        return (num1 * num2)/findGCD(num1, num2);
    }

    public int findGCD(int num1, int num2) {
        int gcd;
        while(num1 % num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        gcd = num2;
        return gcd;
    }
}
