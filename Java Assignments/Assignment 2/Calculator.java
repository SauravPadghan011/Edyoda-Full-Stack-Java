/*
* Assignment-2
* Question Number 1: Write a program to create a calculator
*/

package Assignment2;
import java.util.*;

public class Calculator {
    static Scanner scan = new Scanner(System.in);

    // Input method for first number
    public int firstNumber() {
        System.out.print("Enter First Number: ");
        return scan.nextInt();
    }

    // Input method for second number
    public int secondNumber() {
        System.out.print("Enter Second Number: ");
        return scan.nextInt();
    }

    // main method
    public static void main(String[] args) {
        // Class object
        Calculator calObj = new Calculator();
        int result, opt=1;                                                              // opt is option for switch case
        System.out.print("****** Calculator ******\n\n");

        while(true) {
            System.out.print("1) Addition\n2) Subtraction\n3) Multiplication\n4) Division\n5) Exit\nSelect the Operation: ");
            opt = scan.nextInt();

            switch (opt) {
                case 1 -> {                                                             // Addition Case
                    result = calObj.firstNumber() + calObj.secondNumber();
                    System.out.println("Calculation: " + result);
                }
                case 2 -> {                                                             // Subtraction Case
                    result = calObj.firstNumber() - calObj.secondNumber();
                    System.out.println("Calculation: " + result);
                }
                case 3 -> {                                                             // Multiplication Case
                    result = calObj.firstNumber() * calObj.secondNumber();
                    System.out.println("Calculation: " + result);
                }
                case 4 -> {                                                             // Division Case
                    result = calObj.firstNumber() / calObj.secondNumber();
                    System.out.println("Answer: " + result);
                }
                case 5 -> {                                                             // For Exit
                    System.out.println("    Thank you :)");
                    System.exit(0);
                }
                default -> System.out.println("Invalid Input!!");                       // If user enters invalid option
            }
            System.out.println();
        }
    }
}
