package co.edu.uptc.views.frame;

import javax.swing.JPanel;

import co.edu.uptc.views.Global;

import java.awt.Dimension;

public class FooterPanel extends JPanel {
    
    public FooterPanel() {
        initPanel();
    }
    
    private void initPanel() {
        this.setBackground(Global.FOOTER_BACKGROUND);
        this.setForeground(Global.FOOTER_FOREGROUND);
        this.setLayout(null);
        this.setPreferredSize(new Dimension(0, 50));
    }   
}
