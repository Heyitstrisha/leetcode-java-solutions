package binarySearch;

public class BinarySearch {
    public static void main(String[] args) {

        int [] arr = {854, 44, 22, 22, 11, 1, -22, -33};

        int target = 1;
        int ans = orderagnostic(arr,target);
        System.out.println(ans);

    }

    static int searchelement(int [] arr, int target){

        int start = 0;
        int end = arr.length-1;

        while (start <= end){

            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else {
                //ans found
                return mid;
            }

        }

        return -1;

    }

    static int orderagnostic(int [] arr, int target){

        int start = 0;
        int end = arr.length-1;

        boolean isace = arr[start] < arr[end];

        while (start <= end){

            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isace) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return -1;

    }
}
