import java.io.PrintStream;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        System.out.println("basic");
        System.out.printf("ceva\n");
        System.out.println("Test.main");
        System.out.println("args = " + Arrays.deepToString(args));
        System.out.println("28293 = " + 28293);
        System.out.println("true = " + true);
        System.out.println("false = " + false);
        System.out.println("args = " + args);
    }
}
//basic
//ceva
//Test.main
//args = []
//28293 = 28293
//true = true
//false = false
//args = [Ljava.lang.String;@4b1210ee