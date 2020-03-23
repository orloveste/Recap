package Udemy;


public class _09_ClassesAndObjects {
    public static void main(String[] args) {
        Person chirita = new Person("Chiritoaia");
        chirita.setAge(20);
        Person newPope = new Person("Vasile");
        newPope.setAge(44);

        chirita.sayHelloTo(newPope);
        newPope.sayHelloTo(chirita);

        System.out.println(chirita.getName() +" is "+ chirita.getAge()+ " years old");
        System.out.println(newPope.getName()+" is "+ newPope.getAge()+ " years old");
    }
}
