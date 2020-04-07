package Hackerrank;

import java.util.Scanner;

public class Day06 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How many times you whant check & separate \neven and odd char in provided word?:");
        int numberForTest = reader.nextInt();
        StringBuilder firstString = new StringBuilder();
        StringBuilder secondString = new StringBuilder();
        for (int i = 0; i < numberForTest; i++){
            System.out.println("Please enter your word for transformation:");
            String input = reader.next();
            char[] sortChar = input.toCharArray();
            for (int j = 0; j < sortChar.length; j++){
                if ( j % 2 ==0 ){
                    firstString.append(sortChar[j]);
                } else {
                    secondString.append(sortChar[j]);
                }
            }
            System.out.println(firstString +" "+secondString);
            firstString = new StringBuilder(secondString = new StringBuilder(""));
        }
    }
}
