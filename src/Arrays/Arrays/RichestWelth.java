package Arrays.Arrays;

import java.util.Scanner;

//https://leetcode.com/problems/richest-customer-wealth/
public class RichestWelth {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3,},
                {3, 2, 1}
        };

        System.out.println(maximumWealth(arr));
    }

    static int maximumWealth(int[][] accounts) {

        int maxWelth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int currentsum=0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentsum = currentsum+accounts[i][j];
            }
            if(currentsum>maxWelth){
                maxWelth=currentsum;
            }
        }
        return maxWelth;
    }

    public static class DemoBinary {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);

            System.out.print("Enter the decimal number :");
            int n = in.nextInt();
            System.out.println(n);

            String binary = Integer.toBinaryString(n);
            System.out.print("Binary representation is : " + binary);

            System.out.println();

            char[] ch = binary.toCharArray();

            for (int i =0 ; i< ch.length ; i++){
                if(ch[i] == '0'){
                    ch[i] = '1';
                } else if (ch[i] == '1') {
                    ch[i] = '0';
                }
            }

            String str = new String(ch);

            int decimal_final = Integer.parseInt(str,2);
            System.out.println("Final decimal number :" + decimal_final);

        }
    }
}
