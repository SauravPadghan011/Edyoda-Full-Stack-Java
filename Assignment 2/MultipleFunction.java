/*
 * Assignment-2
 * Write a program to perform the following.
    1. Function to find the sum of 2 numbers
    2. Function to find the sum of 3 numbers
    3. Function to find the multiplication of 2 numbers
    4. Function to find the multiplication of 3 numbers
 */


package Assignment2;
import java.util.*;

public class MultipleFunction {
    static Scanner scan = new Scanner(System.in);
    static MultipleFunction obj = new MultipleFunction();

    // Taking input according to the problem statement
    public int[] inputFunction(int num_of_inputs) {
        int[] inputArray = new int[num_of_inputs];
        for(int i=0; i<num_of_inputs; i++) {
            inputArray[i] = scan.nextInt();                 // Store input in the array
        }
        return inputArray;
    }

    // Method for adding numbers in array
    public void addition(int[] array) {
        int result = 0;
        for (int i : array) {
            result = result + i;
        }
        System.out.println("Sum of numbers: "+result);
    }

    // Method for multiplying numbers in array
    public void multiplication(int[] array) {
        int result = 1;
        for (int i : array) {
            result = result * i;
        }
        System.out.println("Multiplication of numbers: "+result);
    }

    public static void main(String[] args) {
        while(true) {
            System.out.print("1. Function to find the sum of 2 numbers\n" +
                    "2. Function to find the sum of 3 numbers\n" +
                    "3. Function to find the multiplication of 2 numbers\n" +
                    "4. Function to find the multiplication of 3 numbers\n" +
                    "5. Exit\nChoose Option: ");
            int opt = scan.nextInt();
            int[] array = new int[3];
            switch(opt) {
                case 1 -> {
                    array = obj.inputFunction(2);
                    obj.addition(array);
                }
                case 2 -> {
                    array = obj.inputFunction(3);
                    obj.addition(array);
                }
                case 3 -> {
                    array = obj.inputFunction(2);
                    obj.multiplication(array);
                }
                case 4 -> {
                    array = obj.inputFunction(3);
                    obj.multiplication(array);
                }
                case 5 -> System.exit(0);
                default -> {
                    System.out.println("Invalid Choice!!");
                }
            }
            System.out.println();
        }
    }
}
