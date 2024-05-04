package co.edu.uptc.interfaces;

import java.util.List;

import co.edu.uptc.pojos.Person;

public interface ContractPeople {
    public interface Model{
        public void setPresenter(Presenter presenter);
         public void add(Person person);
         public void removeByDocument(Person person);
         public List<Person> getPeople();
    }
    
    public interface View{
        public void setPresenter(Presenter presenter);
        public void begin();
    }
    
    public interface Presenter{
        public void setView(View view);
        public void setModel(Model model);
        public void addPerson(Person person);
        public void removePersonByDocument(Person person);
        public List<Person> getPeople();        
    }
}
