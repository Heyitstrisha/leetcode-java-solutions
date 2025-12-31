package Arrays.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ConcanatationArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    static int[] getConcatenation(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n*2];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i+n] = nums[i];

        }
        return ans;
    }

    public static class ArraysList_Demo {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            int[] arr = {1333 ,34, 66,455 ,43,56};
            System.out.println(maxRange(arr,2,4));
        }

        static int maxRange(int[] arr,int start,int end){
            int maxval = arr[start];
            for (int i = start; i < end; i++) {
                if(arr[i] > maxval){
                    maxval = arr[i];
                }
            }
            return maxval;
        }

        static int max(int[] arr){
            int maxval = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if(arr[i] > maxval){
                    maxval = arr[i];
                }
            }
            return maxval;
        }
    }
}
