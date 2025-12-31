package binarySearch;

public class infiniteArray {
    public static void main(String[] args) {

        int [] arr = {1, 3, 4, 5,6 ,7, 8, 9, 11, 14, 14, 55, 66, 77, 88, 99};
        int target = 54;
        System.out.println(ans(arr, target));

    }

    static int ans(int[] arr, int target) {

        int start = 0;
        int end = 1;

        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        return binarysearch(arr, target, start, end);
    }

    static int binarysearch(int[] arr, int target,int start,int end){

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

        return -1;
    }
}
