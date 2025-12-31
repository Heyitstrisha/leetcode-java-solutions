package linearsearch;

public class Demolinear {
    public static void main(String[] args) {

        int []arr = {12,3,4,66,5,35,76,33};

        int target = 4;
        int ans = getvalue(arr,target);
        System.out.println(ans);

    }
    static int getvalue(int []arr , int target){

        if(target == 0){
            return -1;
        }

        for (int i = 0 ; i<= arr.length ; i++){
            if(arr[i] == target){
                return target;
            }
        }
        return -1;
    }
}
