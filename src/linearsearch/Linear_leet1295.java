package linearsearch;

public class Linear_leet1295 {
    public static void main(String[] args) {

        int []arr = {12,345,2,6,7896};

        System.out.println(findNumbers(arr));

    }
    static public int findNumbers(int[] nums) {

        int count = 0;

        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int numofdigit = digits(num);

        return numofdigit % 2==0;
    }

    static int digits(int num){

        int count = 0;
        if(num < 0){
            num = num * -1;
        }

        while (num > 0){
            count++;
            num = num / 10;
        }
        return count;
    }

}
