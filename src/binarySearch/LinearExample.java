package binarySearch;

public class LinearExample {
    public static void main(String[] args) {

        int [] arr = {10,3, 54, 65,34, 53,34};

        String s = "Pallavi";
        char target = 'a';
        System.out.println(search(s,target));

    }
    static int linear(int[] arr , int target){

        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            if(ele == target){
                return i;
            }
        }
        return -1;
    }

    static int min(int [] arr){

        int ans = arr[0];

        for (int j : arr) {
            if (j < ans) {
                ans = j;
            }
        }

        return ans;
    }

    static boolean search(String str, char target){

        for (int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

}
