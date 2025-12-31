package Arrays.CountingCompair;

import java.util.*;

//https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
public class SmallThanCurrentNum {
    public static void main(String[] args) {

        int[] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));

    }
    static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {

                if(nums[j] < nums[i]){
                    count++;
                }
                result[i] = count;

            }
        }
            return result;
    }

//    static int[] smallerNumbersThanCurrent(int[] nums) {
//
//        int[] sortednum = Arrays.copyOf(nums,nums.length);
//
//        for (int i = 0; i < nums.length; i++) {
//            sortednum[i] = nums[i];
//        }
//
//        Arrays.sort(sortednum);
//
//        Map<Integer,Integer> numtoCount = new HashMap<>();
//
//        for (int i = 0; i < sortednum.length; i++) {
//
//
//
//        }
//
//    }
}
