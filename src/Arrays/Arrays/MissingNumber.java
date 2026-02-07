package Arrays.Arrays;

import java.util.HashMap;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1, 2, 4, 5};
        System.out.println(missingNumber(arr));

    }
    public static int missingNumber(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<>();

        for(int num : nums){
            map.put(num,true);
        }

        int n = nums.length;

        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i)) {
                return i;
            }
        }
        return -1;
    }
}
