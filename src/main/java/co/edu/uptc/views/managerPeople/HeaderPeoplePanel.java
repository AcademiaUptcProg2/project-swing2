package co.edu.uptc.views.managerPeople;

import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.uptc.views.Global;



public class HeaderPeoplePanel extends JPanel {

    public HeaderPeoplePanel() {
        initPanel();
        createTitle();
    }   

    private void initPanel() {
        this.setBackground(Global.HEADER_BACKGROUND);
        this.setForeground(Global.HEADER_FOREGROUND);
     
    }  
    
    private void createTitle() {
      JLabel title = new JLabel("Manejador de Personas");
      title.setBounds(20, 10, 400, 30);
      title.setForeground(this.getForeground());
      this.add(title);
    }
}
