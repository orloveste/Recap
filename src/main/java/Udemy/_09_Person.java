package Udemy;

public class _09_Person {
    String name;
    int age;
    String sayHello = " said hello to ";

    public _09_Person(String name){
        this.name = name;
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

    public void sayHelloTo(_09_Person generic) {
        System.out.println(getName() + sayHello + generic.getName());
    }
}
