package Arrays.Arrays;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3, 3, 3, 5, 6, 6, 6};

        System.out.println(findDuplicate(arr));
    }

    static int findDuplicate(int[] arr){

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if(arr[i] != arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }

        return i+1;
    }
}
