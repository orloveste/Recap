package Udemy.tutorials.basic;

import javax.swing.*;
import java.awt.*;

public class _08_Objects {
    public static void main(String[] args) {

        JFrame window = new JFrame();
        window.setTitle("Udemy window");
        window.setSize(800, 600);
        window.setVisible(true);

        window.getGraphics();
//        Image jetbrains;
//        window.setIconImage(jetbrains://idea/navigate/reference?project=RecapHibernateSDA&path=~\Pictures\7E.PNG);
//        window.setDefaultCloseOperation("OrlovStyle", 1);
        window.getAccessibleContext();
        window.getJMenuBar();
        window.getGlassPane();
        window.getDefaultCloseOperation();
        window.getTransferHandler();
        window.getContentPane();
        window.getRootPane();

        JLabel label =  new JLabel();
        label.getDisplayedMnemonic();
        label.setText("Covid-19 is on going");
        label.getHorizontalAlignment();
        label.getIconTextGap();
        label.getLabelFor();
        label.getIcon();
        label.getAccessibleContext();
        label.getUI();
        label.getUIClassID();
        label.getVerticalAlignment();
//        label.setHorizontalTextPosition(SwingConstants.TOP);
        label.setHorizontalTextPosition(SwingConstants.CENTER);
        label.setHorizontalTextPosition(SwingConstants.RIGHT);

        window.add(label);
    }
}
