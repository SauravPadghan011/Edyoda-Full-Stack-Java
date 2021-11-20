/*
* Java Program to Add Two Matrices
 * */

package edyoda.Assignment4;

public class MatrixAddition {
    private static int[][] arr1 = {{1,3,4}, {2,4,3}, {3,4,5}};
    private static int[][] arr2 = {{1,3,4}, {2,4,3}, {1,2,4}};


    public static void main(String[] args) {
        MatrixAddition obj = new MatrixAddition();
        print();
        addTwoArray();
    }

    static void print() {
        System.out.println("First Array:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("\nSecond Array:");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void addTwoArray() {
        int[][] result = new int[3][3];
        System.out.println("\nAddition of two Array: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                result[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
