package binarySearch;

public class EvenNoOfDigit {
    public static void main(String[] args) {

        int[] arr= {43, 543, 5434, 53, 532};

        System.out.println(findnumber(arr));

//        System.out.println(digit(33));

    }

    static int findnumber(int[]arr ){

        int count = 0;
        for (int num : arr) {
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){

        int numerologist = digit(num);
//        if(numerologist % 2 == 0){
//            return true;
//        }
        return numerologist % 2 == 0;
    }

    static int digit(int num){
        int count = 0;

        if(num == 0){
            return 1;
        }

        if(num < 0){
            num = num * -1;
        }

        while (num > 0){
            count++;
            num = num/10;
        }
        return count;
    }
}
