package co.edu.uptc.pojos;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person  implements Cloneable{
    private String documentType;
    private String documentNumber;
    private String name;
    private String lastName;
    private LocalDate birthDate;
    private Character gender;

    @Override
    public Person clone() {
        try {
            return (Person) super.clone(); 
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

}
