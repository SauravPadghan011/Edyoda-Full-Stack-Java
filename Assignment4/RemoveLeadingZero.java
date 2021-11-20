/*
* Java Program to Remove leading zeros
 * */


package edyoda.Assignment4;

public class RemoveLeadingZero {
    public static void main(String[] args) {
        String str = "00000123569";
        str = removeZero(str);
        System.out.println(str);
    }

    public static String removeZero(String str) {
        // Calculating the leading zeros
        int i=0;
        for(i=0; i<str.length(); i++) {
            if(str.charAt(i) != '0') {
                break;
            }
        }

        // Store the rest non-zero in new String Builder
        int newStrLength = str.length()-i;
        StringBuilder temp = new StringBuilder();
        for(int j=0; j<newStrLength; j++) {
            temp.append(str.charAt(i));
            i++;
        }

        return temp.toString();
    }
}
