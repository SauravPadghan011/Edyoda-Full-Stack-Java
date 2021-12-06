package edyoda.Assignment5;
import java.util.Arrays;
import java.util.Scanner;

public class rotateArray {
    public static int[] arr = new int[]{10,20,30,40,50,60};

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rot = scan.nextInt();

        for(int i=0; i<rot; i++) {
            int j, last;
            last = arr[arr.length-1];
            for(j=arr.length-1; j>0; j--) {
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }


        for(int i: arr) {
            System.out.print(i+" ");
        }
    }
}
