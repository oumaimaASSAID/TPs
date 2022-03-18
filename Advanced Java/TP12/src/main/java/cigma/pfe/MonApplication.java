package cigma.pfe;

import cigma.pfe.models.Client;
import cigma.pfe.controllers.ClientController;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

public class MonApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(ApplicationRunner.class, args);

    }

}

