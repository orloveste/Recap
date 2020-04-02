package Hackerrank.Practice.Algorithms.Warmup;

import java.util.Arrays;

public class Sock_Merchant {
//     Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        int counter = 0;
        int i = 0;
        while (i < n) {
            int element = ar[i];
            if (i == element ){
                counter++;
            } else {

            }
        }
        return counter;
    }

    public static void main(String[] args) {

        int n = 9;
        int[] ar = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};


        System.out.println(Arrays.toString(ar));
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
