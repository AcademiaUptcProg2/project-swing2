package co.edu.uptc.views.managerPeople;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.JDialog;

import co.edu.uptc.pojos.Person;
import co.edu.uptc.views.frame.MainView;
import co.edu.uptc.views.managerPerson.ManagerPersonView;

public class ManagerPeopleView extends JDialog{    
    
    private BodyPeoplePanel bodyPersonPanel;
    private ManagerPersonView managerPersonView;
    private MenuPeoplePanel menuPeoplePanel;
    private MainView mainView;

    public ManagerPeopleView(MainView mainView) {
        super(mainView, true);        
        this.mainView = mainView;
        initDialog();
        createPanelHeader();
        createPanelFooter();   
        createMenupanel();    
        createPanelBody();
        
    }

    private void initDialog() {        
        this.setSize(1000, 500);
        this.setResizable(false);
       this.setLocationRelativeTo(mainView);   
        this.setLayout(new BorderLayout());             
    }
    
public void begin(){
    loadData();    
    this.setVisible(true);
}


private void loadData(){
    List <Person> people = mainView.getPresenter().getPeople();
    System.out.println("people: " + people.size());
    for (Person person : people) {        
        bodyPersonPanel.savePerson(person);
    }
}

private void createPanelHeader(){
    HeaderPeoplePanel panelHeaderPeople = new HeaderPeoplePanel();
    this.add(panelHeaderPeople, BorderLayout.NORTH);
}

private void createPanelBody(){
    bodyPersonPanel = new BodyPeoplePanel(this);
     this.add(bodyPersonPanel, BorderLayout.CENTER);
}
private void createPanelFooter(){
    FooterPeoplePanel panelFooterPeople = new FooterPeoplePanel();
    this.add(panelFooterPeople, BorderLayout.SOUTH);    

}

private void createMenupanel(){
     menuPeoplePanel = new MenuPeoplePanel(this);
    this.add(menuPeoplePanel, BorderLayout.EAST);
}

public void savePerson(Person person) {   
    bodyPersonPanel.savePerson(person);
    mainView.getPresenter().addPerson(person);
}

 public void createManagerPersonView(){
        managerPersonView = new ManagerPersonView(this);
        managerPersonView.begin();
    }

public void setPerson(Person person) {
    if (person != null) {
        menuPeoplePanel.enableBtn(true);
    }
     else {
        menuPeoplePanel.enableBtn(false);
     }
    }


public void delPerson() {
    bodyPersonPanel.delPerson();
}

public void removePersonByDocument(Person person) {
    mainView.getPresenter().removePersonByDocument(person);    
}



}
