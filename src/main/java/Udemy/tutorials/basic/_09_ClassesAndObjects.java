package Udemy.tutorials.basic;


import java.util.Scanner;

public class _09_ClassesAndObjects {
    public static void main(String[] args) {
        _09_Person chirita = new _09_Person("Chiritoaia");
        chirita.setAge(20);
        _09_Person newPope = new _09_Person("Vasile");
        newPope.setAge(44);

        chirita.sayHelloTo(newPope);
        newPope.sayHelloTo(chirita);

        System.out.println(chirita.getName() +" is "+ chirita.getAge()+ " years old");
        System.out.println(newPope.getName()+" is "+ newPope.getAge()+ " years old");

        Scanner reader = new Scanner(System.in);
        //String newEntry = reader.nextLine();
        System.out.print("Enter new namePerson: ");
        _09_Person newEntry = new _09_Person(reader.nextLine());
        System.out.print("enter new age: ");
        newEntry.setAge(reader.nextInt());
        System.out.println(newEntry.getName()+ " is "+ newEntry.getAge()+ " years old");
        newPope.sayHelloTo(newEntry);

    }
}
