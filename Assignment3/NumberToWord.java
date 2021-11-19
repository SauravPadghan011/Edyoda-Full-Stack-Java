/*
* Program to convert integer number into the word format
* */

package edyoda.Assignment3;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberToWord {
    static Scanner scan = new Scanner(System.in);
    private static final ArrayList<String> numStringList = new ArrayList<>();
    private static final ArrayList<String> twoNumStringList = new ArrayList<>();

    // Constructor which adding all the words into the list
    NumberToWord() {
        numStringList.add("One");
        numStringList.add("Two");
        numStringList.add("Three");
        numStringList.add("Four");
        numStringList.add("Five");
        numStringList.add("Six");
        numStringList.add("Seven");
        numStringList.add("Eight");
        numStringList.add("Nine");
        numStringList.add("Ten");
        numStringList.add("Eleven");
        numStringList.add("Twelve");
        numStringList.add("Thirteen");
        numStringList.add("Fourteen");
        numStringList.add("Fifteen");
        numStringList.add("Sixteen");
        numStringList.add("Seventeen");
        numStringList.add("Eighteen");
        numStringList.add("Nineteen");
        numStringList.add("Twenty");

        twoNumStringList.add("Ten");
        twoNumStringList.add("Twenty");
        twoNumStringList.add("Thirty");
        twoNumStringList.add("Forty");
        twoNumStringList.add("Fifty");
        twoNumStringList.add("Sixty");
        twoNumStringList.add("Seventy");
        twoNumStringList.add("Eighty");
        twoNumStringList.add("Ninety");
    }

    // Returns all the two-digit number into the string
    private static String toTwoDigitMethod(int num) {
        if(num == 10) return numStringList.get(num-1);
        if(num == 0) return "";
        int lastDigit = num%10;
        int firstDigit = num/10;
        try{
            if (num >= 11 && num <= 20) {
                return numStringList.get(num - 1);
            } else if (lastDigit == 0) {
                return twoNumStringList.get(firstDigit - 1);
            } else {
                return twoNumStringList.get(firstDigit - 1) + " " + numStringList.get(lastDigit - 1).toLowerCase();
            }
        } catch(IndexOutOfBoundsException e) {
            return numStringList.get(lastDigit-1);
        }

    }

    // Returns all the three-digit number into the string
    private static String toTreeDigitMethod(int num) {
        int lastTwoDigit = num % 100;
        int firstDigit = num / 100;
        try {
            return numStringList.get(firstDigit - 1) + " hundred " + toTwoDigitMethod(lastTwoDigit).toLowerCase();
        } catch (IndexOutOfBoundsException e) {
            return numStringList.get(firstDigit - 1) + " hundred " + numStringList.get(num-firstDigit*100-1);
        }
    }

    // Returns all the three-digit number into the string
    private static String toFourDigitMethod(int num) {
        int lastTreeDigit = num%1000;
        int lastTwoDigit = num%100;
        int firstDigit = num/1000;
        try {
            return numStringList.get(firstDigit-1) + " thousand " + toTreeDigitMethod(lastTreeDigit).toLowerCase();
        } catch (IndexOutOfBoundsException e) {
            return numStringList.get(firstDigit-1) + " thousand " + toTwoDigitMethod(lastTwoDigit).toLowerCase();
        }
    }

    public static void main(String[] args) {
        NumberToWord obj = new NumberToWord();
        System.out.print("Enter Number: ");     // Taking input from user
        int num = scan.nextInt();


        // Find number of element in number
        int totalElement = 0;
        int tempNum = num;
        while(tempNum != 0) {
            tempNum /= 10;
            totalElement++;
        }

        switch(totalElement) {
            case 1 -> {
                System.out.println(numStringList.get(num-1));
            }

            case 2 -> {
                System.out.println(toTwoDigitMethod(num));
            }

            case 3 -> {
                int lastDigit = num%10;
                int firstDigit = num/100;
                if(lastDigit == 0) System.out.println(numStringList.get(firstDigit-1)
                        + " hundred " + toTwoDigitMethod(num%100).toLowerCase());
                else System.out.println(toTreeDigitMethod(num));
            }

            case 4 -> {
                int lastDigit = num%10;
                int firstDigit = num/1000;
                int secondDigit = (num%1000)/100;
                if(num%1000 == 0) System.out.println(numStringList.get(firstDigit-1) + " thousand ");
                else if(lastDigit == 0) System.out.println(numStringList.get(firstDigit-1) + " thousand " + numStringList.get(secondDigit-1).toLowerCase()
                        + " hundred " + toTwoDigitMethod(num%100).toLowerCase());
                else System.out.println(toFourDigitMethod(num));
            }
        }
    }
}