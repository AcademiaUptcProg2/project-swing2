package co.edu.uptc.views.managerPerson;

import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.uptc.views.Global;

import java.awt.Color;

public class HeaderPersonPanel extends JPanel {

    public HeaderPersonPanel() {
        initPanel();
        createTitle();
    }   

    private void initPanel() {
        this.setBackground(Global.HEADER_BACKGROUND);
        this.setForeground(Global.HEADER_FOREGROUND);
     
    }  
    
    private void createTitle() {
      JLabel title = new JLabel("Persona");
      title.setBounds(20, 10, 400, 30);
      this.add(title);
    }
}
