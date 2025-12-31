package binarySearch;

public class SmallLetterGrethanTarget {
    public static void main(String[] args) {

        char[] letter = {'c','f','j'};
        char target = 'j';
        System.out.println(nextGreatestLetter(letter, target));

    }

    static char nextGreatestLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }

        }

        if(start == letters.length){
            return letters[0];
        }

        return letters[start];
    }

}
