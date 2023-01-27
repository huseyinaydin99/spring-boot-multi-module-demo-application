package tr.com.huseyinaydin.model.doctor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 @author Huseyin_Aydin
 @since 1994
 @category Multi Modul Project | Çoklu Maven Projesi / Çoklu Modül
 *
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Doctor {
    @Id
    private int id;
    private String name;
    private String specialist;
}
