package app;

import app.entity.Pizza;
import app.entity.Sauce;
import app.entity.User;
import app.repo.PizzaRepo;
import app.repo.SauceRepo;
import app.repo.UserRepo;
import app.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.transaction.Transactional;

//localhost:8888

@Slf4j
@SpringBootApplication
public class PizzaApp {
    public static void main(String[] args) {
        SpringApplication.run(PizzaApp.class);
        read();
    }

    @Bean
    private static void read() {

    }

    //    It doesnt work
//    @Bean
//    public String AddSauces (SauceRepo sauceRepo){
//        sauceRepo.save(new Sauce("name",123.0,0.3,"photo","description"));
//    return "true";
//    }
    @Bean
    public String AddUser(UserRepo userRepo) {
        userRepo.save(new User("Name", "Surname", "email", "phone", "address"));

        userRepo.save(new User("name2","surname2","email","phone","address"));
        userRepo.save(new User("name3","surname3","email3","phone3","address3"));

        userRepo.deleteById(1);
        Iterable<User> users=userRepo.findAll();
        System.out.println(users);
        return "true";
    }

//    @Transactional
//   @Bean
//    String AddPizza(PizzaRepo pizzaRepo) {
//        pizzaRepo.save(new Pizza("pizza",12.5,"Small",234.4, "ingredients","photo"));
//        return "true";
//    }
}
