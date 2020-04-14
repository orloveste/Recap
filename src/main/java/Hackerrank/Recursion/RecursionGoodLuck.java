package Hackerrank.Recursion;

public class RecursionGoodLuck {

//    f(f(f(a))) ----- a= 20;
//    f(a) = 5 + a

//    f(20) =  5 + 20 =25
//    f(f(f(20))) = f(f(25))

//    f(25) = 5 + 25 = 30
//    f(f(f(20))) = f(f(25)) = f(30)

//    f(30) = 5 + 30 = 35
//    f(f(f(20))) = f(f(25)) = f(30) = 35

//    5+4+3+2+1
    /*3 + 2 + 1*/
    public static int Summation(int n){
        if ( n <= 0 ) { //Base case - end
            return 0; // additive identity property
        }
        else { //Recursive case - loop
            /*3 + Summation(2);
            3 + 2 + Summation(1);
            3 + 2 + 1 + Summation(0);
            3 + 2 + 1 + 0 = 6;*/

            return n + Summation(n-1);
        }
    }
    // 5! --> 5 * 4 * 3 * 2 * 1 --> 5 * 4!
    // 4! --> 4 * 3 * 2 * 1
    public static int Factorial(int n){
        if ( n <= 1){ // Base case
            return  1;
        } // recursive case
        else {
//            Factorial(4) = 4 * Factorial(3);
//            4 * 3 * Factorial(2);
//            4 * 3 * 2 * Factorial(1);
//            4 * 3 * 2 * 1;
            return n * Factorial(n-1);
        }
    }

    // 5^3 = 5 * 5 * 5
    // 5^3 = 5 * 5^2 = 5 * 5 * 5^1 = 5 * 5 * 5 * 5^0 = 5 * 5 * 5 * 1
    public static int exponentiation(int n, int p){
        if ( p <= 0 ){ // base case
            return 1;
        }
        else { // recursive
//            5 * exponentiation(5, 2)
//            5 * 5 * exponentiation(5,1)
//            5 * 5 * 5 * exponentiation(5,0)
//            5 * 5 * 5 * 1
            return n * exponentiation(n, p-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(Summation(3));

    }
}
