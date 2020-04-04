package Hackerrank;

import java.util.Random;

public class Day03 {
    public String randomNumber(){
        Random random = new Random();
        int n = Math.abs(random.nextInt());
        System.out.print(n+" ");
        n %= 2;
        if (n == 0){
            return "Weird - even";
        } else {
            return "Not Weird - odd";
        }
    }

    static String weird(){
        System.out.println("Weird");
        return weird();
    }

    public static void main(String[] args) {
       Day03 game = new Day03();
        System.out.println(game.randomNumber());
        System.out.println(game.randomNumber());
        System.out.println(game.randomNumber());

    }
}
