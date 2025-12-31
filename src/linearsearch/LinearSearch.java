package linearsearch;

public class LinearSearch {
    public static void main(String[] args) {

        int []arr = {12,3,44,56,88,43,6,7};
        int target = 56;

        System.out.println(Linearserch(arr,target,1,5));
    }

    static int Linearserch(int [] arr , int targer , int start , int end){

        if(arr.length == 0){
            return -1;
        }

        for (int i = start ; i<= end ; i++){
            if(arr[i] == targer){
                return targer;
            }
        }
        return -1;

    }
}
