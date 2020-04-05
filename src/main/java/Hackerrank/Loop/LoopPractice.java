package Hackerrank.Loop;

public class LoopPractice {

    public static void practiceWhileLoop(){
        int x = 0;
        while ( x < 5){
            System.out.println("Value of x is "+x);
            x++;
        }
    }
    public static void precticeDoWhileLoop(){
        int x = 0;
        do {
            System.out.println("doWhile Value of x is "+x);
            x++;
        } while (x < 10);
    }
    public static void practiceForLoop(){
        for (int x =0; x < 20; x++){
            System.out.println("For Value of x is "+x);
            if ( x == 10 ) {
                break;
            }
        }
        System.out.println("The end!");
    }

    public static void main(String[] args) {
        practiceForLoop();

    }
}
// while
// do-while
// for