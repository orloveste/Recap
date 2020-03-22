package Udemy;

public class Conditionals {
    public static void main(String[] args) {
        boolean sayHi = false;
        boolean sayBye = true;


        if (sayHi){
            System.out.println("Hello and stay home");
        } else if (sayBye){
            System.out.println("Ciao and stay home");
        }else {
            System.out.println("Else");
        }
//        if (sayBye){
//            System.out.println("Ciao and stay home");
//        }
        int playerX = 50;
         if (true && true){
             System.out.println("and executed");
         }
         if (playerX < 0  || playerX > 800){
             System.out.println("or executed");
         }

    }
}
