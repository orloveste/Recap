package Hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day08 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of choices: ");
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("enter your friend name: ");
            String name = in.next();
            System.out.println("Enter your friend number: ");
            int phone = in.nextInt();
            // Write code here
            Map<String, Integer> phoneBook = new HashMap<>();
            phoneBook.put(name, phone);
            System.out.println("PhoneBook = "+ phoneBook.toString());
        }

        while(in.hasNext()){
            String s = in.next();
            // Write code here
        }
        in.close();
    }
}
