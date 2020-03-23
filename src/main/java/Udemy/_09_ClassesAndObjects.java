package Udemy;

import javax.swing.*;

public class _09_ClassesAndObjects {
    public static void main(String[] args) {
        JLabel label = new JLabel();

        Person chirita = new Person();
        chirita.name = "Chiritoaia";
        chirita.age = 20;
        Person popa = new Person();
        popa.name = "Vasile";
        popa.age = 25;

        System.out.println(chirita.name +" is "+ chirita.age+ " years old");
        System.out.println(popa.name +" is "+ popa.age+ " years old");
    }
}
