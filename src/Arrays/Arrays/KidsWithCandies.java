package Arrays.Arrays;

//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public static void main(String[] args) {

        int[] arr = {2,3,5,1,3};
        int ectra = 3;
        System.out.println(kidsWithCandies(arr,ectra));

    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result = new ArrayList<>();

        int max = 0;

        for (int i = 0; i < candies.length; i++) {
            if(candies[i]>=max){
                max=candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            if(candies[i]+extraCandies >= max){
                result.add(true);
            }else {
                result.add(false);
            }
        }

        return result;

    }

}
