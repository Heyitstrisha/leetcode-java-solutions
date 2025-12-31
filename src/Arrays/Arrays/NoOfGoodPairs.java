package Arrays.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NoOfGoodPairs {
    public static void main(String[] args) {

        int[] arr = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));

    }
    static int numIdenticalPairs(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length ; j++) {

                if(nums[i] == nums[j] & i < j){
                    count++;
                }
            }
        }
        return count;
    }

    public static class Demo {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            int[] arr = new int[6];

            for(int i=1; i<arr.length;i++) {

                arr[i] = in.nextInt();

            }

            System.out.println(Arrays.toString(arr));

            for(int i = 1 ; i<arr.length ; i++){

                if(arr[i] <= arr[i-1]){
                    arr[i] = arr[i-1] + 1;
                }
            }

            System.out.println("Updated array");

            for(Integer a : arr){
                System.out.print(a + " ");
            }

            int sum = 0;
            for (Integer a : arr){
                sum = sum + a;
            }
            System.out.println();
            System.out.println("minimum summation of values is " + sum);
        }
    }

    public static class Multidimentional {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            int [][] arr = new int[3][3];

            for (int row = 0; row < arr.length; row++) {
                for (int col = 0; col < arr[row].length; col++) {

                    arr[row][col] = in.nextInt();
                }
            }

    //        for (int row = 0; row < arr.length; row++) {
    //            for (int col = 0; col < arr[row].length; col++) {
    //
    //                System.out.print(arr[row][col] + " ");
    //            }
    //            System.out.println();
    //        }

            for (int row = 0; row < arr.length; row++) {
                System.out.println(Arrays.toString(arr[row]));
            }

       }
    }
}
