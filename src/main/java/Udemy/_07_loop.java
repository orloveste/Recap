package Udemy;

public class _07_loop {
    public static void main(String[] args) {
        System.out.println("while");
        whileLoop();
        System.out.println("\ndoWhile");
        doWhileLoop();
        System.out.println("\nfor Loop");
        forLoop();
    }

    static void whileLoop(){
        int counter = 0;

        while (counter <10){
            counter = counter+1;
            System.out.print(counter+" ");

        }
    }
    static void doWhileLoop(){
        int counter = 11;
        do{
            System.out.print(counter++ +" ");
        }while (counter <= 20);
    }
    static void forLoop(){
        for (int counter = 21; counter <= 30; counter = counter+1){
            System.out.print(counter+" ");
        }
    }
}
