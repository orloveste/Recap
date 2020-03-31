package Hackerrank.Practice.Algorithms.Warmup;

import java.util.Arrays;

public class Simple_Array_Sum {
    static int simpleArraySum(int[] ar) {
        int lenAr = ar.length;
        int sum = 0;
        for (int i=0; i<lenAr; i++){
            sum += ar[i];
        }return sum;
    }


    public static void main(String[] args) {
        int[] ar = new int[]{1,2,3,4,10,11};
        System.out.println("out array is: "+ Arrays.toString(ar));

        int result = simpleArraySum(ar);

        System.out.println("sum is: "+ result);
    }
}
//https://www.hackerrank.com/challenges/simple-array-sum/problem