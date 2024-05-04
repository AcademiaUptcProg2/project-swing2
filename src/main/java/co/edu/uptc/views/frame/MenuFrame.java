package co.edu.uptc.views.frame;

import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import co.edu.uptc.views.managerPeople.ManagerPeopleView;


public class MenuFrame extends JMenuBar{
    private JMenu menuFile; 
    private MainView jFrame;

    public MenuFrame(MainView Jframe) {        
        this.jFrame = Jframe;
        initMenu();
        createMenuFile();
        createBtnManegerPeople();
        createBtnExit();
    }

    private void initMenu() {
        this.setLayout(null);
    }

    private void createMenuFile(){
         menuFile = new JMenu("File");
        this.add(menuFile);   
    }


private void createBtnManegerPeople(){
    JMenuItem btnPerson = new JMenuItem("Person");    
    this.menuFile.add(btnPerson);
    btnPerson.addActionListener(new ActionListener() {  
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            jFrame.createManagerPeopleView();
        }}
    );
}

private void createBtnExit(){
    JMenuItem btnExit = new JMenuItem("Exit");
    this.menuFile.add(btnExit);
    btnExit.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            System.exit(0);
        }
    });
}


}
