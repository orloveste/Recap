package Udemy.tutorials.basic;

public class _10_ReferenceANdValueTypes {
    private static int number;

    public static void main(String[] args) {
        int x= 69;
        addOneToInt(x);//method not pass adding - dont have a reference
        System.out.println("x = by nothing = " +x);

        number = 5;
        System.out.println("x = "+ number);
        addOneToInt(number);
        System.out.println("x+1 = "+ number);
        addOneToInt(number);
        System.out.println("x+1 = "+ number);

        _09_Person bulibasha;
        bulibasha = new _09_Person("Bulibasha");
        bulibasha.setAge(89);
        celebrateCovid19(bulibasha);
        System.out.println(bulibasha.getName()+" will get sick on "+bulibasha.getAge()+" birthDay");

    }

    private static void celebrateCovid19(_09_Person bulibasha) {
        bulibasha.setAge(bulibasha.getAge()+1);
    }

    private static void addOneToInt(int number) {
        _10_ReferenceANdValueTypes.number = number+1;
    }
}
