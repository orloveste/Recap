package Hackerrank;

import java.util.Arrays;

import static com.google.common.primitives.Ints.reverse;

//Day 7: Arrays
public class Day07 {
    public static void main(String[] args) {
        int[] arr = new int[] {1,4,3,2};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
//https://www.hackerrank.com/challenges/30-arrays/problem