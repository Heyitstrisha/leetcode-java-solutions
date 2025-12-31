package Arrays.CountingCompair;

public class HighestAltitude {
    public static void main(String[] args) {

        int[] arr = {-4,-3,-2,-1,4,3,2};
        System.out.println(largestAltitude(arr));

    }

    static int largestAltitude(int[] gain) {

        int[] alt = new int[gain.length+1];

        alt[0] = 0;

        int currentalt = 0;

        for (int i = 0; i < gain.length; i++) {
            currentalt = currentalt + gain[i];
            alt[i+1] = currentalt;
        }

        int max = 0;
        for (int i = 0; i < alt.length; i++) {

            if(alt[i] > max){
                max=alt[i];
            }
        }

        return max;

    }
}
