package Hackerrank.Practice.Algorithms.Warmup;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Sock_Merchant {
    static int sockMerchant(int n, int[] ar) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int intermediar = 0; intermediar < n; intermediar++) {
            int elementOfArray = ar[intermediar];
            if (set.contains(elementOfArray)) {
                set.remove(elementOfArray);
                count++;
            } else {
                set.add(elementOfArray);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        //toDo reader key and put in array for sorting pairs
        int[] ar = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20,30,20,10,20};
        int n = ar.length;
        while (reader.hasNext()){
            ar[n] =reader.nextInt();
        } reader.close();

        System.out.println(Arrays.toString(ar));
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
