package Hackerrank;

import java.util.Scanner;

//Day 5: Loops
public class Day05 {
    int result;
    int i;

    private void adding(int n) {
        for (this.i = 1; i < 11; i++) {
           result= n*i;
            System.out.println(n+" x "+i+" = "+result);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Your number: ");
        int n = scanner.nextInt();

        Day05 newAdd = new Day05();
        newAdd.adding(n);

    }


}
