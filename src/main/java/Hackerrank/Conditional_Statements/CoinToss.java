package Hackerrank.Conditional_Statements;

import java.util.Random;

public class CoinToss {

    public int tossCoin(){
        Random random = new Random();
        int toss = Math.abs(random.nextInt()) % 2;
        return toss;
    }
    public static void main(String[] args) {
        CoinToss game = new CoinToss();
        System.out.println(game.tossCoin());
        System.out.println(game.tossCoin());
        System.out.println(game.tossCoin());
        System.out.println(game.tossCoin());
        System.out.println(game.tossCoin());
        System.out.println(game.tossCoin());
    }
}
