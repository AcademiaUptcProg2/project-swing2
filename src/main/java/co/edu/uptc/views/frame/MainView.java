package co.edu.uptc.views.frame;

import java.awt.BorderLayout;
import javax.swing.JFrame;

import co.edu.uptc.interfaces.ContractPeople;
import co.edu.uptc.views.managerPeople.ManagerPeopleView;



public class MainView extends JFrame implements ContractPeople.View {
      
   private HeaderPanel headerPanel;
   private ManagerPeopleView managerPeopleView;
   private ContractPeople.Presenter presenter;
     

    public MainView() {
       initFrame();
       createMenuFrame();
       createMenuPanel();
       createFooterPanel();
       createBodyPanel();
       createNewsPanel();
       createHeaderPanel();
    }


    private void initFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Taller de programación");
        this.setLayout(new BorderLayout());
        this.setSize(1200, 600);
        this.setLocationRelativeTo(null);     
    }

    public void begin(){
        this.setVisible(true);
    }


        private void createMenuFrame(){
       MenuFrame menuHeader = new MenuFrame(this);
       this.setJMenuBar(menuHeader);
    }


    private void createMenuPanel(){
        MenuPanel menuPanel = new MenuPanel();
        this.add(menuPanel, BorderLayout.WEST);
    }

    private void createFooterPanel(){
        FooterPanel statusPanel = new FooterPanel();
        this.add(statusPanel, BorderLayout.SOUTH);
    }

    private void createBodyPanel(){
        BodyPanel workPanel = new BodyPanel();
        this.add(workPanel, BorderLayout.CENTER);
    }

    private void createNewsPanel(){
        NewsPanel newsPanel = new NewsPanel();
        this.add(newsPanel, BorderLayout.EAST);
    }

    private void createHeaderPanel(){
         headerPanel = new HeaderPanel();
        this.add(headerPanel, BorderLayout.NORTH);       
    }



    public void createManagerPeopleView(){
        managerPeopleView = new ManagerPeopleView(this);
        managerPeopleView.begin();       
    }


    @Override
    public void setPresenter(ContractPeople.Presenter presenter) {
       this.presenter = presenter;
    }
   

    public ContractPeople.Presenter getPresenter(){
        return presenter;
    }    
   
}
