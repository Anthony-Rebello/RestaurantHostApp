package source;

import javax.swing.*;
import java.awt.*;

public class MainToolbar extends JToolBar {
    MainToolbar(Double screenWidth, Double screenHeight){
        this.setBounds(0, 0, screenWidth.intValue(), (int)(0.1 * screenHeight));
        this.setRollover(false);
        this.setFloatable(false);
        this.setBackground(new Color(210,210,247));
        this.setLayout(null);
        JButton add = new JButton();
        JButton settings = new JButton();
        JButton edit = new JButton();
        add.setText("Add New Table");
        settings.setText("Settings");
        edit.setText("Edit");
        add.setBounds(0, 0, (int)(0.1 * screenWidth), (int)(0.1 * screenHeight));
        settings.setBounds((int)(0.9 * screenWidth), 0, (int)(0.1 * screenWidth), (int)(0.1 * screenHeight));
        edit.setBounds((int)(0.8 * screenWidth), 0, (int)(0.1 * screenWidth), (int)(0.1 * screenHeight));
        this.add(add);
        this.add(settings);
        this.add(edit);
    }
}
