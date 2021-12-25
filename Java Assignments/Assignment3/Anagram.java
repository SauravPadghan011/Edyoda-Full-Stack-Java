/*
* Write a Java program to check whether two strings entered by user are anagram or not?
 * */

package edyoda.Assignment3;
import java.util.*;

public class Anagram {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        String[] str1Array = str1.split("");
        String[] str2Array = str2.split("");

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        boolean result = Arrays.equals(str1Array, str2Array);
        if(result)
            System.out.println(str1 + " " + str2 + " are anagram");
        else
            System.out.println(str1 + " " + str2 + " are not anagram");
    }
}
