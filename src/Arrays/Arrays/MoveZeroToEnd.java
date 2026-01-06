package Arrays.Arrays;
import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/
public class MoveZeroToEnd {
    public static void main(String[] args) {

        int[] num = {0,1,0,3,12};
        moveZeroes(num);

    }
    static void moveZeroes(int[] nums) {

        //this problem i solve using the 2-pointer approach
        // the time complexity is O(n) because we are not using the another array to store the value we're just modifying it with the 2 pointer approach

        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[k] = nums[i];
                k++;
            }
        }

            while (k < nums.length){  // so the k value will be 3 and 3 is less than nums.length(5) so it will add the 0 in the 3rd index
                nums[k] = 0;
                k++;

            }

        System.out.println(Arrays.toString(nums));

    }
}
