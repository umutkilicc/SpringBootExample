import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import service.AdressService;

@SpringBootApplication
@ComponentScan(basePackages = {"repository", "service", "entity", "controller"})
@EnableJpaRepositories(basePackages = "repository")
@EnableAutoConfiguration
@EntityScan(basePackages = {"entity"})
public class main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(main.class, args);

        AdressService adressService = applicationContext.getBean(AdressService.class);
        adressService.addAdress();




    }
}
