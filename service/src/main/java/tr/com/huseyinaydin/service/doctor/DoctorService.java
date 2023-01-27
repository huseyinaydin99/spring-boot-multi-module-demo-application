package tr.com.huseyinaydin.service.doctor;

import tr.com.huseyinaydin.dao.doctor.DoctorRepository;
import tr.com.huseyinaydin.mailservice.EmailService;
import tr.com.huseyinaydin.model.doctor.Doctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 @author Huseyin_Aydin
 @since 1994
 @category Multi Modul Project | Çoklu Maven Projesi / Çoklu Modül
 *
 **/

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository repository;
    @Autowired
    private EmailService service;

    @PostConstruct
    public void initDoctor(){
        repository.saveAll(Stream.of
                (new Doctor(101,"Ord. Hüseyin Aydın","Deli doktoru( Psikiyatri )"),
                        new Doctor(102,"Ord. Prof. Doç. Pratisyen, Uzman, Yardımcı, Operatör Dr. Abuzer Kömürcü"," < Aha dayıya sor"))
                .collect(Collectors.toList()));
    }

    public List<Doctor> getDoctors(){
        service.sendEMail();
        return repository.findAll();
    }
}
