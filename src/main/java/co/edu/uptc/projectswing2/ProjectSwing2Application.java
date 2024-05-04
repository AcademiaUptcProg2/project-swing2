package co.edu.uptc.projectswing2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import co.edu.uptc.interfaces.ContractPeople;

import co.edu.uptc.models.ManagerPeople;
import co.edu.uptc.presenters.Presenter;
import co.edu.uptc.views.frame.MainView;



@SpringBootApplication
public class ProjectSwing2Application {

	public static void main(String[] args) {
		SpringApplication.run(ProjectSwing2Application.class, args);

		ContractPeople.Model model = new ManagerPeople();
		ContractPeople.Presenter presenter = new Presenter();
		ContractPeople.View view = new MainView();      
		model.setPresenter(presenter);
		view.setPresenter(presenter);
		presenter.setModel(model);
		presenter.setView(view);		

        view.begin();
	}

}
