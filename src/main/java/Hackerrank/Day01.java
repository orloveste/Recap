package Hackerrank;

import java.util.Scanner;

public class Day01 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int i2;
        double d2;
        String s2;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        System.out.println("int");
        i2 = scan.nextInt();
        System.out.println("double");
        d2 = scan.nextDouble();
        System.out.println("string");
        s2 = scan.nextLine();
        //"is the best place to learn and practice coding!"


        /* Print the sum of both integer variables on a new line. */
        int sum =i+i2;
        System.out.println(sum);
        /* Print the sum of the double variables on a new line. */
        double sumD =d+d2;
        System.out.println(sumD);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
        System.out.println(s+s2);
        //scan.close();
    }
}
// Exp output 1
//16
//8.0
//HackerRank is the best place to learn and practice coding!

//Exp output 2
//7
//6.8
//HackerRank is my favorite platform!