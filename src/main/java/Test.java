//scope

public class Test {
    static int x; //declaring
    //static int y; // for use in exterior of the method
    
    public static void main(String[] args) {
        x = 5;//asign value to x
        System.out.println("x = " + x);

        doSOmething();
        System.out.println(x);

        doSomethingLocally();
        System.out.println(y);// no go like this
    }
    static void doSOmething(){
        x= 10;//else value
    }
    static void doSomethingLocally(){
        int y= 100;//declare and initialization y, lives just in this method
    }
}
