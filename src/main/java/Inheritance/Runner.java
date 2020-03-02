package Inheritance;

public class Runner {


    public static void main(String[] args) {
        FirstInterface merdenea = (FirstInterface) new LastClass();
//        SecondInterface pizza = new SecondClass();
//        LastInterface shaorma = new Runner();

        merdenea.doingSomething();
//        pizza.doingSomething();
//        shaorma.doingSomething();

    }
}
