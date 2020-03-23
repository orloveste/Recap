package Udemy;

public class Person {
    String name;
    int age;
    String sayHello = " said hello to ";
    public Person(String name){
        this.name = name;
        System.out.println("Create person");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayHelloTo(Person generic) {
        System.out.println(getName() + sayHello + generic.getName());
    }
}
