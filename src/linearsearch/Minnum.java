package linearsearch;

public class Minnum {
    public static void main(String[] args) {

        int []arr = {12,3,4,43,456,87,35};
        System.out.println(minnum(arr));
    }
    static int minnum(int []arr){

        int ans = arr[0];
        for (int i = 1 ; i< arr.length ;i++ ){

            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
