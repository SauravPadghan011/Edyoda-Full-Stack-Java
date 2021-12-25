/*
* Java Program to Check Whether the Given String is Pangram and throw runtime exception if not
 * */

package edyoda.Assignment4;

public class Pangram {
    public static void main(String[] args) throws Exception {
        String str = "The quick brown fox jumps over the lazy dog";
        isPangram(str.toLowerCase());
    }

    public static void isPangram(String str) throws Exception {

        if(str.length() < 26) throw new Exception("Not a Pangram");
        else {
            for(char ch='a'; ch<='z'; ch++) {
                if(str.indexOf(ch) < 0) {
                    throw new Exception("Not a Pangram");
                }
            }
        }
        System.out.println("String is a Pangram");
    }
}
