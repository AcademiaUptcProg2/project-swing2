package co.edu.uptc.views.managerPeople;

import javax.swing.JButton;
import javax.swing.JPanel;
import co.edu.uptc.views.Global;


public class FooterPeoplePanel extends JPanel {
    
    public FooterPeoplePanel() {
        initPanel();
    }
    
    private void initPanel() {
        this.setBackground(Global.FOOTER_BACKGROUND);
        this.setForeground(Global.FOOTER_FOREGROUND);

        createBtnSave();
        createBtnExit();
    }

    private void createBtnSave() {
      JButton btn = new JButton("Guardar");
      btn.setBounds(10, 10, 150, 30);
      this.add(btn);
    }

    private void createBtnExit() {

      JButton btn = new JButton("Salir");
      btn.setBounds(180, 10, 150, 30);
      this.add(btn);    
    }


}
