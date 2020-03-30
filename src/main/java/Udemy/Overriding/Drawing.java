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
        g.setColor(new Color(0,0,255));
        g.drawRect(150,150, 100, 25);// x/y coordonates
        g.setColor(Color.CYAN);
        g.fill3DRect(250, 150, 100,25, true);
        g.setColor(Color.MAGENTA);
        g.drawString("Covid-19", 250, 250);
    }
}
