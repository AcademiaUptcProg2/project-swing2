package co.edu.uptc.views.managerPerson;

import java.awt.BorderLayout;
import javax.swing.JDialog;


import co.edu.uptc.views.managerPeople.ManagerPeopleView;

public class ManagerPersonView  extends JDialog{   
    
    private BodyPersonPanel panelBodyPerson;    
    private ManagerPeopleView managerPeopleView;
    public ManagerPersonView(ManagerPeopleView managerPeopleView) {             
        super(managerPeopleView, true);
        this.managerPeopleView = managerPeopleView;
        
         initDialig();
         createPanelHeader();
         createPanelBody();
         createPanelFooter();
    }

    private void initDialig() {
        this.setSize(500, 300);
        this.setLocationRelativeTo(managerPeopleView);        
         this.setLayout(new BorderLayout());
         this.setResizable(false);
    }

    public void begin() {
        this.setVisible(true);
    }   


    private void createPanelHeader() {
      HeaderPersonPanel panelHeaderPerson = new HeaderPersonPanel();
      this.add(panelHeaderPerson, BorderLayout.NORTH);

    }

    private void createPanelBody() {    
      panelBodyPerson = new BodyPersonPanel();
     this.add(panelBodyPerson, BorderLayout.CENTER);
    }

    private void createPanelFooter() {      
     FooterPersonPanel panelFooterPerson = new FooterPersonPanel(this);
     this.add(panelFooterPerson, BorderLayout.SOUTH);
    }
    

    public void savePerson() {
        managerPeopleView.savePerson(panelBodyPerson.makePerson());        
    }

    

    

}
