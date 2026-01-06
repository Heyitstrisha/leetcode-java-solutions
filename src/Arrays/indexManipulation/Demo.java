package Arrays.indexManipulation;

import java.util.Arrays;
import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {

        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr, target)));

    }

    static int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int j = nums.length-1;

        for (int i = 0; i < nums.length; i++) {

            map.put(i,nums[i]);

            if(nums[i] + nums[j] == target){
                map.get(i);
            }else {
                j--;
            }

        }

        int[] result = new int[map.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = map.get(i);
        }


        return result;

    }
}
