package Arrays.CountingCompair;

import java.util.HashSet;

public class PangramNumbers {
    public static void main(String[] args) {

        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        System.out.println(checkIfPangram(sentence));

    }

    static boolean checkIfPangram(String sentence) {

        HashSet<Character> set = new HashSet();

        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                set.add(ch);
            }
        }

        return set.size()==26;

    }
}
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/