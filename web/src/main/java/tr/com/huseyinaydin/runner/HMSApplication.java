package tr.com.huseyinaydin.runner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 @author Huseyin_Aydin
 @since 1994
 @category Multi Modul Project | Çoklu Maven Projesi / Çoklu Modül
 *
 **/

@SpringBootApplication
@ComponentScan(basePackages = {"tr.com.huseyinaydin.*"})
@EntityScan(basePackages = {"tr.com.huseyinaydin.*"})
@EnableJpaRepositories(basePackages = {"tr.com.huseyinaydin.*"})
public class HMSApplication {

    public static void main(String[] args) {
        SpringApplication.run(HMSApplication.class);
    }
}
