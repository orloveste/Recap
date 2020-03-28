package Udemy.Inheritance;

import javax.swing.*;

public class MyWindow extends JFrame {
    public static void main(String[] args) {
        new MyWindow();
    }
    public MyWindow(){
        setSize(500,500);
        setVisible(true);
        setTitle("My Window Inheritance");
    }
}
