package co.edu.uptc.views.frame;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;

import co.edu.uptc.views.Global;

public class MenuPanel extends JPanel{

    public MenuPanel() {
        initPanel();
        createBtnSize();
    }

    private void initPanel() {       
        this.setBackground(Global.MENU_BACKGROUND);
        this.setForeground(Global.MENU_FOREGROUND);
        this.setLayout(null);
        this.setPreferredSize(new Dimension(180, 0));

    }

    private void createBtnSize(){
        JButton btn = new JButton("Size");
        this.add(btn);
    }
    
}
