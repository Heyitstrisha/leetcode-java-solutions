package Arrays.indexManipulation;

import java.util.ArrayList;
import java.util.Arrays;

//https://leetcode.com/problems/create-target-array-in-the-given-order/
public class TargetArrGivenOrder {
    public static void main(String[] args) {

        int[] num = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};

        System.out.println(Arrays.toString(createTargetArray(num, index)));

    }
    static int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            list.add(index[i],nums[i]);

        }
        int[] result = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;

    }
}
