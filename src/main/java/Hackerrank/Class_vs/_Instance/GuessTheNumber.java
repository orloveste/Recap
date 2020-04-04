package Hackerrank.Class_vs._Instance;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    int theNumber;
    int max;
    Scanner reader = new Scanner(System.in);
    public GuessTheNumber(){
        Random random = new Random();
        theNumber = Math.abs(random.nextInt())%(max+1);
        //random.nextInt();
    }
    public void play(){
        int move = reader.nextInt();
        if ( move> theNumber ){
            System.out.println("to big");
        } else if ( move< theNumber ){
            System.out.println("Is too small");
        }else {
            System.out.println("Got it");
        }
    }

    public static void howBigIsMyNumber(int x){
        if ( x >= 0 && x <= 10 ){
            System.out.println("Number is pretty small");
        } else if ( x >= 11 && x <= 100  ){
            System.out.println("Number is pretty big");
        }else {
            System.out.println("Number is out of space");
        }
    }

    public static void main(String[] args) {

    }

}
