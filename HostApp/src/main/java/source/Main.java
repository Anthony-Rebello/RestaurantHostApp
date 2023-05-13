package source;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.*;

public class Main {

    public static void showGUI(){
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        Double screenWidth = dimension.getWidth();
        Double screenHeight = dimension.getHeight();
        JFrame f = new JFrame("Test");
        MainToolbar mainToolbar = new MainToolbar(screenWidth, screenHeight);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(dimension);
        f.getContentPane().setBackground(new Color(30, 100, 150));
        f.add(mainToolbar);
        f.setLayout(null); //-> disables layout formatting.
        //f.pack(); //-> makes the frame the size of the elements it contains.
        f.setVisible(true);
        f.setResizable(false);
    }
    public static void main(String[] args){
        showGUI();
    }
}
