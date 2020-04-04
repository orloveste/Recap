package Hackerrank;

import java.util.Scanner;

//Day 4: Class vs. Instance
public class Day04 {
    private int age;

    public Day04(int initialAge) {
        // Add some more code to run some checks on initialAge
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        System.out.println(/*Insert correct print statement here*/);
    }

    public void yearPasses() {
        // Increment this person's age.
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            int age = sc.nextInt();
            Day04 p = new Day04(age);
            p.amIOld();
            for (int j = 0; j < 3; j++) {
                p.yearPasses();
            }
            p.amIOld();
            System.out.println();
        }
        sc.close();
    }
}
