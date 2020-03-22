package Udemy;

public class _07_loop {
    public static void main(String[] args) {
        whileLoop();
        System.out.println("doWhile");
        doWhileLoop();
    }

    static void whileLoop(){
        int counter = 0;

        while (counter <10){
            counter = counter+1;
            System.out.println(counter);
        }
    }
    static void doWhileLoop(){
        int counter = 11;
        do{
            System.out.println(counter++);
        }while (counter <= 20);
    }
}
