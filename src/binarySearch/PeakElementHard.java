package binarySearch;

interface MountainArray {
    int get(int index);
    int length();
}

public class PeakElementHard {

    public static void main(String[] args) {

//        int[] arr = {1, 2, 4, 6, 8, 4, 3, 1};
//        int target = 3;
//
//        MountainArray mountainArr = new MountainArrayImpl(arr);
//
//        System.out.println(findInMountainArray(target, mountainArr));
    }


    static int findInMountainArray(int target, MountainArray mountainArr) {

        int peak = peakIndexInMountainArray(mountainArr);

        // search in ascending part
        int firstTry = orderAgnostic(mountainArr, target, 0, peak, true);
        if (firstTry != -1) {
            return firstTry;
        }

        // search in descending part
        return orderAgnostic(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }

    static int orderAgnostic(MountainArray arr, int target, int start, int end, boolean isAsc) {

        while (start <= end) {

            int mid = start + (end - start) / 2;
            int midVal = arr.get(mid);

            if (midVal == target) {
                return mid;
            }

            if (isAsc) {
                if (target < midVal) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > midVal) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    static int peakIndexInMountainArray(MountainArray arr) {

        int start = 0;
        int end = arr.length() - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr.get(mid) < arr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start; // ✅ index of peak
    }
}
