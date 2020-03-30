package Udemy.Overriding;

import javax.swing.*;
import java.awt.*;

public class Drawing extends JFrame {
    public static void main(String[] args) {
        new Drawing();
    }
    public Drawing() {
       setSize(600, 600);
       setVisible(true);
    }


    @Override
    public void paint(Graphics g) {
        //super.paint(g);
        g.drawArc(150,50,34,53,535,355);
        g.draw3DRect(50,50,100,25, false);
        g.drawRect(150,150, 100, 25);// x/y coordonates
    }
}
