package Hackerrank;

import java.util.Random;

public class Day03 {
    public String randomNumber(){
        Random random = new Random();
        int n = Math.abs(random.nextInt());
        if (1<=n&& n <=100) { //toDo constrain up
            System.out.print(n + " ");

            n %= 2;
            if (n == 0) {
                return "Weird - even";
            } else {
                return "Not Weird - odd";
            }
        }
        return null; //print null if is not in constrain
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
