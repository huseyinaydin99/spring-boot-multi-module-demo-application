package tr.com.huseyinaydin.mailservice;

/**
 *
 @author Huseyin_Aydin
 @since 1994
 @category Multi Modul Project | Çoklu Maven Projesi / Çoklu Modül
 *
 **/

import org.springframework.stereotype.Service;

@Service
public class EmailService {


    public void sendEMail(){
        System.out.println("Email service working !!");
    }
}
