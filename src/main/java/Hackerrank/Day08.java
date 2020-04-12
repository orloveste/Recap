package Hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day08 {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> phoneBook = new HashMap<>();
        System.out.print("Number of new entries: ");
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print("Enter your friend name: ");
            String name = in.next();
            System.out.print("Enter your friend number: ");
            int phone = in.nextInt();
            phoneBook.put(name, phone);
        }
        System.out.println("PhoneBook = "+ phoneBook.toString());
        while(in.hasNext()){
            String s = in.next();
            // Write code here
        }
        in.close();
    }
}
