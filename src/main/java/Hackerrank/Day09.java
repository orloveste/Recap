package Hackerrank;

import java.util.Scanner;

public class Day09 {
    // Complete the factorial function below.
    public static int Factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * Factorial(n - 1);
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number: "); //3
        int n = scanner.nextInt();


        int result = Factorial(n);

        System.out.println("factorial is: "+ result); // will be 6

    }
}
