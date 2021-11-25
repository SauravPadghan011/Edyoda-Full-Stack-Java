package edyoda.Assignment5;
import java.util.HashMap;
import java.util.Scanner;

public class OctalToBinary {

    private final HashMap<Integer, String> hash = new HashMap<>();

    OctalToBinary() {
        hash.put(0,"000");
        hash.put(1,"001");
        hash.put(2,"010");
        hash.put(3,"011");
        hash.put(4,"100");
        hash.put(5,"101");
        hash.put(6,"110");
        hash.put(7,"111");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        OctalToBinary obj = new OctalToBinary();

        System.out.print("Enter Octal Number: ");
        int oct = scan.nextInt();

        System.out.println(obj.octalToBinary(oct));
    }

    private String octalToBinary(int oct) {
        StringBuilder bin = new StringBuilder("");

        int temp = oct;
        int total = 0;
        while(temp!=0) {
            temp/=10;
            total++;
        }

        int pow = total-1;
        while(oct != 0) {
            int digit = oct/(int) Math.pow(10,pow);
            oct%=(int) Math.pow(10,pow);
            pow--;

            bin.append(hash.get(digit));
        }
        return bin.toString();
    }
}
