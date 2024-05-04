package co.edu.uptc.views.managerPerson;

import co.edu.uptc.pojos.Person;
import co.edu.uptc.views.Global;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import org.jdesktop.swingx.JXDatePicker;

public class BodyPersonPanel extends JPanel {

  private GroupLayout layout;
  private JLabel lblDocumentType;
  private JLabel lblDocumentNumber;
  private JLabel lblName;
  private JLabel lblLastName;
  private JLabel lblBirthDate;
  private JLabel lblGender;
  private JTextField textFieldDocumentNumber;
  private JTextField textFieldName;
  private JTextField textFieldLastName;
  private JXDatePicker picker;
  private JRadioButton maleButton ;
  private JRadioButton femaleButton;
  

  private JComboBox<String> textComboDocumentType;

  public BodyPersonPanel() {
    initPanel();
    createLblDocumentType();
    createLblDocumentNumber();
    createTextFieldDocumentType();
    createTextFieldDocumentNumber();
    createLblName();
    createLblLastName();
    createLblBirthDate();
    createLblGender();
    createTextFieldName();
    createTextFieldLastName();
    createTextFieldBirthDate();
    createTextFieldGender();
    groupElements();
  }

  private void initPanel() {
    this.setBackground(Global.BODY_BACKGROUND);
    this.setForeground(Global.BODY_FOREGROUND);
    //this.setLayout(null);
    layout = new GroupLayout(this);
    this.setLayout(layout);
    layout.setAutoCreateGaps(true);    
    layout.setAutoCreateContainerGaps(true);
    
    
  }

  private void groupElements() {
    layout.setHorizontalGroup(
      layout
        .createSequentialGroup()
        .addGroup(
          layout
            .createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(lblDocumentType)
            .addComponent(lblDocumentNumber)
            .addComponent(lblName)
            .addComponent(lblLastName)
            .addComponent(lblBirthDate)
            .addComponent(lblGender)
        )
        .addGroup(
          layout
            .createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(textComboDocumentType,GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addComponent(textFieldDocumentNumber,GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .addComponent(textFieldName)
            .addComponent(textFieldLastName)
            .addComponent(picker)
            .addGroup(layout.createSequentialGroup() 
                .addComponent(maleButton)
                .addComponent(femaleButton))

        )
    );

    layout.setVerticalGroup(
      layout
        .createSequentialGroup()
        .addGroup(
          layout
            .createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(lblDocumentType)
            .addComponent(textComboDocumentType)
        )
        .addGroup(
          layout
            .createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(lblDocumentNumber)
            .addComponent(textFieldDocumentNumber)
        )
        .addGroup(
          layout
            .createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(lblName)
            .addComponent(textFieldName)
        )
        .addGroup(
          layout
            .createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(lblLastName)
            .addComponent(textFieldLastName)
        )
        .addGroup(
          layout
            .createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(lblBirthDate)
            .addComponent(picker)
        )
        .addGroup(
          layout
            .createParallelGroup(GroupLayout.Alignment.BASELINE)
            .addComponent(lblGender)
            .addComponent(maleButton)
            .addComponent(femaleButton)
        )
    );
  }

  private void createLblDocumentType() {
    lblDocumentType = new JLabel("Tipo de Documento: ");
    lblDocumentType.setBounds(20, 10, 200, 30);
    // this.add(lblDocumentType);
  }

  private void createLblDocumentNumber() {
    lblDocumentNumber = new JLabel("Número documento:");
    lblDocumentNumber.setBounds(20, 40, 200, 30);
    //  this.add(lblDocumentNumber);
  }

  private void createLblName() {
    lblName = new JLabel("Nombres:");
    lblName.setBounds(20, 80, 200, 30);
    //  this.add(lblName);
  }

  private void createLblLastName() {
    lblLastName = new JLabel("Apellidos:");
    lblLastName.setBounds(20, 120, 200, 30);
    //  this.add(lblLastName);
  }

  private void createLblBirthDate() {
    lblBirthDate = new JLabel("Fecha Nacimiento:");
    lblBirthDate.setBounds(20, 160, 200, 30);
    //   this.add(lblBirthDate);
  }

  private void createLblGender() {
    lblGender = new JLabel("Genero:");
    lblGender.setBounds(20, 200, 200, 30);
    //  this.add(lblGender);

  }

  private void createTextFieldDocumentType() {
    String s1[] = { "Cédula", "Tarjeta de Identidad", "Pasaporte" };

    textComboDocumentType = new JComboBox<String>(s1);
    textComboDocumentType.setPreferredSize(new Dimension(150,25));
    //setBounds(220, 10, 200, 25);

    //  this.add(textComboDocumentType);
  }

  private void createTextFieldDocumentNumber() {
    textFieldDocumentNumber = new JTextField();
    textFieldDocumentNumber.setPreferredSize(new Dimension(100,25));
    //   this.add(textFieldDocumentNumber);
    textFieldDocumentNumber.addKeyListener(
      new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
          if (!Character.isDigit(e.getKeyChar())) {
            e.consume();
          }
        }

        @Override
        public void keyPressed(KeyEvent e) {}

        @Override
        public void keyReleased(KeyEvent e) {}
      }
    );
  }

  private void createTextFieldName() {
    textFieldName = new JTextField();
    textFieldName.setBounds(220, 80, 200, 25);
    //   this.add(textFieldName);
  }

  private void createTextFieldLastName() {
    textFieldLastName = new JTextField();
    textFieldLastName.setBounds(220, 120, 200, 25);
    //  this.add(textFieldLastName);
  }

  private void createTextFieldBirthDate() {
    picker = new JXDatePicker();
    picker.setBounds(220, 160, 200, 25);
    picker.setFormats(new SimpleDateFormat("dd/MM/yyyy"));
    //    this.add(picker);
  }

  private void createTextFieldGender() {
     maleButton = new JRadioButton("Masculino");
     femaleButton = new JRadioButton("Femenino");
    ButtonGroup genderGroup = new ButtonGroup();
    genderGroup.add(maleButton);
    genderGroup.add(femaleButton);

    maleButton.setBounds(220, 200, 100, 25);
    femaleButton.setBounds(320, 200, 100, 25);   
  }



  public Person makePerson() {
    Person person = new Person();
    person.setDocumentType(textComboDocumentType.getSelectedItem().toString());
    person.setDocumentNumber(textFieldDocumentNumber.getText());
    person.setName(textFieldName.getText());
    person.setLastName(textFieldLastName.getText());
    Date selectedDate = picker.getDate();
    LocalDate birthDate = selectedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
    person.setBirthDate(birthDate);
    person.setGender(maleButton.isSelected() ? 'M' : 'F');
    return person;
   }
}