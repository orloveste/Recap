package Udemy;

import javax.swing.*;

public class _08_Objects {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setTitle("Udemy window");
        window.setSize(800, 600);
        window.setVisible(true);

        JLabel label =  new JLabel();
        label.setText("Covid-19 is on going");

        window.add(label);
    }
}
