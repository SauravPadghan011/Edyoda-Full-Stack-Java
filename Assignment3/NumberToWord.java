package edyoda.Assignment3;
import java.util.ArrayList;
import java.util.Scanner;

public class NumberToWord {
    static Scanner scan = new Scanner(System.in);
    private static final ArrayList<String> stringList = new ArrayList<>();
    private static final ArrayList<String> stringTwoDigit = new ArrayList<>();

    private void addElement() {
        stringList.add("One");
        stringList.add("Two");
        stringList.add("Three");
        stringList.add("Four");
        stringList.add("Five");
        stringList.add("Six");
        stringList.add("Seven");
        stringList.add("Eight");
        stringList.add("Nine");
        stringList.add("Ten");
        stringList.add("Eleven");
        stringList.add("Twelve");
        stringList.add("Thirteen");
        stringList.add("Fourteen");
        stringList.add("Fifteen");
        stringList.add("Sixteen");
        stringList.add("Seventeen");
        stringList.add("Eighteen");
        stringList.add("Nineteen");
        stringList.add("Twenty");
    }

    private void addTwoDigit() {
        stringTwoDigit.add("Ten");
        stringTwoDigit.add("Twenty");
        stringTwoDigit.add("Thirty");
        stringTwoDigit.add("Forty");
        stringTwoDigit.add("Fifty");
        stringTwoDigit.add("Sixty");
        stringTwoDigit.add("Seventy");
        stringTwoDigit.add("Eighty");
        stringTwoDigit.add("Ninety");
    }

    private static String toTwoDigitMethod(int num) {
        if(num == 10) return stringList.get(num-1);
        int lastDigit = num%10;
        int firstDigit = num/10;
        try{
            if (num == 10) System.out.println(stringList.get(num - 1));
            else if (num >= 11 && num <= 20) {
                return stringList.get(num - 1);
            } else if (lastDigit == 0) {
                return stringTwoDigit.get(firstDigit - 1);
            } else {
                return stringTwoDigit.get(firstDigit - 1) + " " + stringList.get(lastDigit - 1).toLowerCase();
            }
        } catch(IndexOutOfBoundsException e) {
            return stringList.get(lastDigit-1);
        }
        return null;
    }

    private static String toTreeDigitMethod(int num) {
        int lastTwoDigit = num % 100;
        int firstDigit = num / 100;
        try {
            return stringList.get(firstDigit - 1) + " hundred " + toTwoDigitMethod(lastTwoDigit).toLowerCase();
        } catch (IndexOutOfBoundsException e) {
            return stringList.get(firstDigit - 1) + " hundred " + stringList.get(num-firstDigit*100-1);
        }
    }

    private static String toFourDigitMethod(int num) {
        int lastTreeDigit = num%1000;
        int lastTwoDigit = num%100;
        int firstDigit = num/1000;
        try {
            return stringList.get(firstDigit-1) + " thousand " + toTreeDigitMethod(lastTreeDigit).toLowerCase();
        } catch (IndexOutOfBoundsException e) {
            return stringList.get(firstDigit-1) + " thousand " + toTwoDigitMethod(lastTwoDigit).toLowerCase();
        }
    }

    public static void main(String[] args) {
        NumberToWord obj = new NumberToWord();
        System.out.print("Enter Number: ");
        int num = scan.nextInt();

        obj.addElement();
        obj.addTwoDigit();

        // Find number of element in number
        int totalElement = 0;
        int tempNum = num;
        while(tempNum != 0) {
            tempNum /= 10;
            totalElement++;
        }

        switch(totalElement) {
            case 1 -> {
                System.out.println(stringList.get(num-1));
            }

            case 2 -> {
                System.out.println(toTwoDigitMethod(num));
            }

            case 3 -> {
                int lastDigit = num%10;
                int firstDigit = num/100;
                if(lastDigit == 0) System.out.println(stringList.get(firstDigit-1)
                        + " hundred " + toTwoDigitMethod(num%100).toLowerCase());
                else System.out.println(toTreeDigitMethod(num));
            }

            case 4 -> {
                int lastDigit = num%10;
                int firstDigit = num/1000;
                int secondDigit = (num%1000)/100;
                if(lastDigit == 0) System.out.println(stringList.get(firstDigit-1) + " thousand " + stringList.get(secondDigit-1).toLowerCase()
                        + " hundred " + toTwoDigitMethod(num%100).toLowerCase());
                else System.out.println(toFourDigitMethod(num));
            }
        }
    }
}