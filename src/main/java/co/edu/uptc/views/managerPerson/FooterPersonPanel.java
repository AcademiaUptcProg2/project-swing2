package co.edu.uptc.views.managerPerson;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import co.edu.uptc.views.Global;



public class FooterPersonPanel extends JPanel {
  private ManagerPersonView managerPersonView;
  
    
    public FooterPersonPanel(ManagerPersonView managerPersonView) {
        this.managerPersonView = managerPersonView;
        initPanel();
    }
    
    private void initPanel() {
        this.setBackground(Global.FOOTER_BACKGROUND);
        this.setForeground(Global.FOOTER_FOREGROUND);

        createBtnSave();
        createBtnCancel();
    }

    private void createBtnSave() {
      JButton btn = new JButton("Guardar");
      btn.setBounds(10, 10, 150, 30);
      this.add(btn);
      btn.addActionListener(new ActionListener() {

        @Override
        public void actionPerformed(ActionEvent e) {
           managerPersonView.savePerson();             
         
        }
        
      });
    }

    private void createBtnCancel() {

      JButton btn = new JButton("Cancelar");
      btn.setBounds(180, 10, 150, 30);
      this.add(btn);    
    }


}
