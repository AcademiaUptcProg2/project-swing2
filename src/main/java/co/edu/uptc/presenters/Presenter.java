package co.edu.uptc.presenters;

import java.util.List;

import co.edu.uptc.interfaces.ContractPeople;
import co.edu.uptc.pojos.Person;

public class Presenter implements ContractPeople.Presenter {
    private ContractPeople.View view;
    private ContractPeople.Model model;

    @Override
    public void setView(ContractPeople.View view) {
        this.view = view;
    }

    @Override
    public void setModel(ContractPeople.Model model) {
        this.model = model;
    }

    @Override
    public void addPerson(Person person) {
        model.add(person);
    }

    @Override
    public void removePersonByDocument(Person person) {
        model.removeByDocument(person);
    }

    @Override
    public List<Person> getPeople() {
        return model.getPeople();
    }
    
}
