package Hackerrank.Class_vs._Instance;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    int theNumber;
    int max;
    Scanner reader = new Scanner(System.in);
    protected GuessTheNumber(){
        Random random = new Random();
        max = 100;
        theNumber = Math.abs(random.nextInt()) % (max + 1);
    }
    public void play(){
        while (true) {
            int move = reader.nextInt();
            if ( move > theNumber ) {
                System.out.print("to big: _");
            } else if ( move < theNumber ) {
                System.out.print("Is too small: _");
            } else {
                System.out.println("Got it !!!");
                break;
            }
        }
    }

    public static void howBigIsMyNumber(int x){
        if ( x >= 0 && x <= 10 ){
            System.out.print("Number is pretty small: _");
        } else if ( x >= 11 && x <= 100  ){
            System.out.print("Number is pretty big: _");
        }else {
            System.out.println("Number is out of space! _");
        }
    }

    public static void main(String[] args) {
        GuessTheNumber guessGame = new GuessTheNumber();
        System.out.print("Wecome, guess number 0-100: ?");
        guessGame.play();
    }
}
