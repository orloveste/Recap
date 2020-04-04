package Hackerrank;

import java.text.MessageFormat;
import java.util.Random;

public class Day03 {
    public String randomNumber() {
        Random random = new Random();
        int n = Math.abs(random.nextInt(101));
        System.out.print(MessageFormat.format("{0} ", n));
        n %= 2;
        if ( (2 <= n && n <= 5)||((n < 20) && (n == 0)) ) {
            return "Not Weird - even";
        }
        else {//toDo even nr 6-20 will be here
            return "Weird - odd";
        }
    }
//    public int condition1(){
//
//    }

    static String weird(){
        System.out.println("Weird");
        return weird();
    }

    public static void main(String[] args) {
       Day03 game = new Day03();
        System.out.println(game.randomNumber());
        System.out.println(game.randomNumber());
        System.out.println(game.randomNumber());
        System.out.println(game.randomNumber());
        System.out.println(game.randomNumber());
        System.out.println(game.randomNumber());
        System.out.println(game.randomNumber());
        System.out.println(game.randomNumber());
        System.out.println(game.randomNumber());

    }
}
