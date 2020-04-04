package Hackerrank.Class_vs._Instance;

public class GuessTheNumber {
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
        howBigIsMyNumber(0);
        howBigIsMyNumber(10);
        howBigIsMyNumber(9);
        howBigIsMyNumber(75);
        howBigIsMyNumber(-1);
        howBigIsMyNumber(105);
        howBigIsMyNumber(18);
        howBigIsMyNumber(76);
    }

}
