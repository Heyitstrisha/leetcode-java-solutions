package linearsearch;

import java.util.Arrays;

public class Search2dArray {
    public static void main(String[] args) {

        int [][]arr = {
                {12, 23, 5},
                {75, 32, 23},
                {3, 76, 21}
        };
        int target = 76;
        int []ans = search(arr,target);
        System.out.println(Arrays.toString(ans));

        System.out.println(searchmax(arr));
    }
    static int[] search(int [][] arr , int target){

       for (int i = 0 ; i<arr.length ; i++){
           for (int j = 0 ; j<arr.length ; j++){

               if(arr[i][j] == target){
                   return new int[]{i,j};
               }
           }
       }
        return new int[]{-1,-1};
    }

    static int searchmax(int [][] arr){

        int ans = arr[0][0];
        for (int i = 0 ; i<arr.length ; i++){
            for (int j = 0 ; j<arr.length ; j++){

                if(arr[i][j] > ans){
                    ans = arr[i][j];
                }
            }
        }
        return ans;
    }
}
