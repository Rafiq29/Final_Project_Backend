package app;

import app.entity.Pizza;
import app.entity.User;
import app.repo.PizzaRepo;
import app.repo.UserRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//localhost:8888

@Slf4j
@SpringBootApplication
public class PizzaApp {

    public static void main(String[] args) {
        SpringApplication.run(PizzaApp.class);
    }

}
