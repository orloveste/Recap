package Udemy;

public class _10_ReferenceANdValueTypes {
    private static int number;

    public static void main(String[] args) {
        number = 5;
        System.out.println("x = "+ number);
        addOneToInt(number);
        System.out.println("x+1 = "+ number);
    }

    private static void addOneToInt(int number) {
        _10_ReferenceANdValueTypes.number = number+1;
    }
}
