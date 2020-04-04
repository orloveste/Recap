package Hackerrank;

import java.text.MessageFormat;
import java.util.Random;

public class Day03 {
    public String randomNumber() {
        Random random = new Random();
        int n = Math.abs(random.nextInt(101));
        System.out.print(MessageFormat.format("{0} ", n));
        String answer = "";

        switch (n % 2) {
            case 1:
                answer = weird();
                break;
            default:
                if ( 2 <= n && n <= 5 ) answer = notWeird();
                else if ( 6 <= n && n <= 20 ) answer = weird();
                else if ( 20 < n ) answer = notWeird();
                break;
        }
        return  answer;
    }

    private static String weird(){
        return "Weird";
    }
    private static String notWeird(){
        return "Not Weird";
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
