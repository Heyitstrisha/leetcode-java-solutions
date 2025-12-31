package Arrays.Arrays;

import java.util.Arrays;

public class RunningSumIDArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));

    }
    static int[] runningSum(int[] nums) {

        int sum=0;

        int[] runningSum = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            sum = sum+nums[i];
            runningSum[i] = sum;
        }

        return runningSum;

    }
}
