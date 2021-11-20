/*
* Java Program to Find the Transpose
 * */

package edyoda.Assignment4;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
        int[][] result = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = arr1[j][i];
            }
        }

        System.out.println("Original Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println("\nTranspose of Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
