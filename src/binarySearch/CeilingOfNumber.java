package binarySearch;

public class CeilingOfNumber {
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 7, 9, 12, 15};
        int target = 8;

        System.out.println(ceilingnumber(arr, target));

    }

    static int ceilingnumber(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                //ans found
                return arr[mid];
            }

        }

        return arr[start];
    }
}
