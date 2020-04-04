package Hackerrank;

import java.text.MessageFormat;
import java.util.Random;

public class Day03 {
    public String randomNumber() {
        Random random = new Random();
        int n = Math.abs(random.nextInt(101));
        System.out.print(MessageFormat.format("{0} ", n));
        n %= 2;
        if( n == 0 ){
            if (2 <= n && n <= 5)  {
                System.out.println("Not Weird 2-if");
            }
            else if (6 <= n && n <= 20) {
                System.out.println("Weird else-if1");
            }
            else if( 20 < n) {
                System.out.println("Not Weird else-if2");
            }
            return null;
        }
        else {
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
