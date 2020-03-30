package Udemy.Overriding;

public class Subclass extends Base {
    public static void main(String[] args) {
        Subclass s = new Subclass();
    }

    public Subclass() {
        sayHi();
    }

    @Override
    public void sayHi() {
        super.sayHi();
        System.out.println("Hi super");
    }
}
