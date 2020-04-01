package Hackerrank;

import java.util.Scanner;

public class Day01 {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int i2;
        double d2;
        String s2;

        System.out.println("int");
        i2 = scan.nextInt();

        System.out.println("double");
        d2 = scan.nextDouble();

        System.out.println("string");
        scan.nextLine();// todo is not reading string 's2' if is not here
        s2 = scan.nextLine();//

        System.out.println(i+i2);

        System.out.println(d+d2);

        System.out.println(s+s2);
    }
}
// Exp output 1
//16 // 12
//8.0 // 4
//HackerRank // is the best place to learn and practice coding!

//Exp output 2
//7 // 3
//6.8 // 2.8
//HackerRank // is my favorite platform!