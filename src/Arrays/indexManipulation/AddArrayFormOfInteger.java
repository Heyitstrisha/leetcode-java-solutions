package Arrays.indexManipulation;

import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/add-to-array-form-of-integer/
public class AddArrayFormOfInteger {
    public static void main(String[] args) {

        int[] num = {1,2,0,0};
        int k = 34;

        System.out.println(addToArrayForm(num, k));

    }
    static List<Integer> addToArrayForm(int[] num, int k) {

        ArrayList<Integer> aa = new ArrayList<>(num.length);


        int i = num.length-1;
        //Start from last index

        while (i >= 0 || k > 0){

            if(i >= 0){
                k = k + num[i];     // adding k to the last digit
                i--;
            }

            aa.add(0,k % 10); // storing the last digit from index 0
            k = k / 10;                 //carry
        }

        return aa;

    }
}
