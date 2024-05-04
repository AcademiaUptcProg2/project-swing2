package co.edu.uptc.views.managerPeople;

import co.edu.uptc.pojos.Person;
import co.edu.uptc.views.Global;
import java.awt.Dimension;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.time.LocalDate;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class BodyPeoplePanel extends JPanel {

  private JScrollPane scrollPane;
  private JTable table;
  private ManagerPeopleView managerPeopleView;

  public BodyPeoplePanel(ManagerPeopleView managerPeopleView) {
    this.managerPeopleView = managerPeopleView;
    initPanel();
    createTable();
    adjustScrollPaneSize();
  }

  private BodyPeoplePanel getInstance() {
    return this;
  }

  private void adjustScrollPaneSize() {
    this.addComponentListener(
        new ComponentAdapter() {
          @Override
          public void componentResized(ComponentEvent e) {
            super.componentResized(e);
            Dimension panelSize = getInstance().getSize();
            scrollPane.setPreferredSize(panelSize);
            getInstance().revalidate();
          }
        }
      );
  }

  private void initPanel() {
    this.setBackground(Global.BODY_BACKGROUND);
    this.setForeground(Global.BODY_FOREGROUND);
  }

  private void createTable() {
    String[] columnNames = {
      "TipoDoc",
      "Número",
      "Nombre",
      "Apellidos",
      "Fecha Nac",
      "Genero",
    };
    Object[][] data = {};

    DefaultTableModel tableModel = new DefaultTableModel(data, columnNames) {
      @Override
      public boolean isCellEditable(int row, int column) {
        return false;
      }
    };

    table = new JTable(tableModel);
    table.getColumnModel().getColumn(0).setPreferredWidth(40);
    table.getColumnModel().getColumn(1).setPreferredWidth(50);
    table.getColumnModel().getColumn(2).setPreferredWidth(210);
    table.getColumnModel().getColumn(3).setPreferredWidth(210);
    table.getColumnModel().getColumn(4).setPreferredWidth(30);
    table.getColumnModel().getColumn(5).setPreferredWidth(4);

    scrollPane = new JScrollPane(table);
    table.setFillsViewportHeight(true);
    scrollPane.setPreferredSize(this.getSize());
    table.setRowSelectionAllowed(true);

     table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {           
                if (!e.getValueIsAdjusting() && table.getSelectedRow() != -1) {                   
                    managerPeopleView.setPerson(makPerson(table.getModel()));                   
                }
            }
        });

    add(scrollPane);
  }


private Person makPerson(TableModel tableModel) {
    Person person = new Person();
    person.setDocumentType((String) tableModel.getValueAt(table.getSelectedRow(), 0));
    person.setDocumentNumber((String) tableModel.getValueAt(table.getSelectedRow(), 1));
    person.setName((String) tableModel.getValueAt(table.getSelectedRow(), 2));
    person.setLastName((String) tableModel.getValueAt(table.getSelectedRow(), 3));
    LocalDate selectedDate = (LocalDate) tableModel.getValueAt(table.getSelectedRow(), 4);
    person.setBirthDate(selectedDate);
    person.setGender((Character) tableModel.getValueAt(table.getSelectedRow(), 5));

    return person;
}

  public void savePerson(Person person) {
    ((DefaultTableModel) table.getModel()).addRow(
        new Object[] {
          person.getDocumentType(),
          person.getDocumentNumber(),
          person.getName(),
          person.getLastName(),
          person.getBirthDate(),
          person.getGender(),
        }
      );
  }

  public void delPerson() {
     Person person = makPerson(table.getModel());
     managerPeopleView.removePersonByDocument(person);

    ((DefaultTableModel) table.getModel()).removeRow(table.getSelectedRow());
    //managerPeopleView.removePersonByDocument(person);
    managerPeopleView.setPerson(null);
  }
}
