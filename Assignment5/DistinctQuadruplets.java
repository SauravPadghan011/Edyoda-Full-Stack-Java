package edyoda.Assignment5;

import java.util.Arrays;

public class DistinctQuadruplets {
//    private int[] arr = new int[]{1,8,30,-5,20,50};
    private static int[] arr = new int[]{1, 0, -1, 0, -2, 2};
//    private static int[] arr = new int[]{1, 2,-3,4,-2,-1,3};


    DistinctQuadruplets() {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        DistinctQuadruplets obj = new DistinctQuadruplets();
        int target = 0;
//        obj.naiveApproach(target);
        obj.efficientApproach(target);

    }

    private void efficientApproach(int target) {
        for(int i=0; i<arr.length-3; i++) {
            for(int j=i+1; j<arr.length-2; j++) {
                int sum = target - (arr[i]+arr[j]);

                int start = j+1;
                int end = arr.length-1;
                while(start<end) {
                    int tempSum = arr[start] + arr[end];
                    if(tempSum == sum) {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[start]+" "+arr[end]);
//                        System.out.println(arr[i]+arr[j]+arr[start]+arr[end]);
                        start++;
                        end--;
                    } else if(tempSum < sum) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }
    }

    private void naiveApproach(int target) {
        int sum = 0;
        for(int i=0; i<arr.length-3; i++) {
            for(int j=i+1; j<arr.length-2; j++) {
                for(int k=j+1; k< arr.length-1; k++) {
                    for(int l=k+1; l<arr.length; l++) {
                        sum = arr[i]+arr[j]+arr[k]+arr[l];
                        if(sum == target) System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" "+arr[l]+" sum: "+sum);
                    }
                }
            }
        }
    }
}
