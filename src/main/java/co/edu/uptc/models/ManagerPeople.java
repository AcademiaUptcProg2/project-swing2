package co.edu.uptc.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import co.edu.uptc.interfaces.ContractPeople;

import co.edu.uptc.pojos.Person;

public class ManagerPeople  implements ContractPeople.Model{
    private List<Person> people;
    private ContractPeople.Presenter presenter;


    public ManagerPeople() {
        people = new ArrayList<>();
        addPeropleToTest();  
    }


    // this is just for test
    private void addPeropleToTest(){
        people.add(new Person( "CC", "123456789", "John", "Doe", LocalDate.now(), 'M' ));
        people.add(new Person( "CC", "987654321", "Jane", "Doe", LocalDate.now(), 'F' ));
        people.add(new Person( "TI", "987654321", "John", "Doe", LocalDate.now(), 'M' ));
        people.add(new Person( "TI", "123456789", "Jane", "Doe", LocalDate.now(), 'F' ));    
    }

    @Override
    public void add(Person person) {
        if (person != null) {
            Person personToAdd = person.clone();
            people.add(personToAdd);    
        }        
    }

    @Override
    public void removeByDocument(Person person) {
        Person personToRemove = null;
        for (Person p : people) {
            if (p.getDocumentNumber()
            .equals(person.getDocumentNumber()) && p.getDocumentType().equals(person.getDocumentType())) {
                personToRemove = p;
                break;
            }
        }
        if (personToRemove != null) {
            people.remove(personToRemove);
        }        
    }

    @Override
    public List<Person> getPeople() {
        List<Person> AuxPeople = new ArrayList<>();
        for (Person person : people) {
            AuxPeople.add(person.clone());
        }
        return AuxPeople;
    }


    @Override
    public void setPresenter(ContractPeople.Presenter presenter) {
        this.presenter = presenter;
    }   

    
}
