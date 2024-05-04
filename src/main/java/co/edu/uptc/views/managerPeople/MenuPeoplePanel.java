package co.edu.uptc.views.managerPeople;

import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import co.edu.uptc.views.Global;

public class MenuPeoplePanel extends JPanel {
       
    public ManagerPeopleView managerPeopleView;
    private JButton btnAdd;
    private JButton btnDel;

    public MenuPeoplePanel( ManagerPeopleView managerPeopleView) {
        this.managerPeopleView = managerPeopleView;        
        initPanel();
        createBtnAdd();
        createBtnDel();
    }   

    private void initPanel() {
        this.setBackground(Global.MENU_BACKGROUND);
        this.setForeground(Global.MENU_FOREGROUND);
        this.setPreferredSize(new Dimension(100,0));
     
    }  
    

    

private void createBtnAdd(){
    btnAdd = new JButton("Adicionar");
    btnAdd.setPreferredSize(new Dimension(90, 30));    
    this.add(btnAdd);
    btnAdd.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            managerPeopleView.createManagerPersonView();
        }
    });
}


private void createBtnDel(){
     btnDel = new JButton("Eliminar");
    btnDel.setPreferredSize(new Dimension(90, 30));
    btnDel.setEnabled(false);
    this.add(btnDel);
    btnDel.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            managerPeopleView.delPerson();
        }
    });
}

public void enableBtn(boolean value) {   
   btnDel.setEnabled(value);
}


    
}
