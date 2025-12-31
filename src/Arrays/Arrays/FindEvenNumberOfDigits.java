package Arrays.Arrays;

public class FindEvenNumberOfDigits {
    public static void main(String[] args) {

        int[] nums = {11, 22, 34445, 432, 5674};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(even(nums[i])){
                count++;
            }
        }
        return count;

    }

    static boolean even(int num){
        if(digit(num) % 2 == 0){
            return true;
        }
        return false;
    }

    static int digit(int num){
        int count = 0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
