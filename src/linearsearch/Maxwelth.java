package linearsearch;

public class Maxwelth {
    public static void main(String[] args) {

        int [][]arr= {
                {1,2,3},{3,2,1}
        };
        System.out.println(maximumWealth(arr));

    }
    static public int maximumWealth(int[][] accounts) {

        System.out.println(accounts.length);
        int sum = 0;
        int ans = Integer.MIN_VALUE;
        for(int persone = 0 ; persone < accounts.length ; persone++){
            for(int account = 0 ; account < accounts[persone].length ; account ++){

                sum = sum + accounts[persone][account];
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
