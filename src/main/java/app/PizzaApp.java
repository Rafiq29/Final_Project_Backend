package app;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//localhost:8888

@Slf4j
@SpringBootApplication
public class PizzaApp {

    public static void main(String[] args) {
        SpringApplication.run(PizzaApp.class);
    }

}
