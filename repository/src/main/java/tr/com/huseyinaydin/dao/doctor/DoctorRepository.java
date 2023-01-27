package tr.com.huseyinaydin.dao.doctor;

import tr.com.huseyinaydin.model.doctor.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 @author Huseyin_Aydin
 @since 1994
 @category Multi Modul Project | Çoklu Maven Projesi / Çoklu Modül
 *
 **/

public interface DoctorRepository extends JpaRepository<Doctor,Integer> {
}
