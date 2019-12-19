package app;

import app.initial.InitialPizza;
import app.initial.InitialSauce;
import app.initial.InitialUsers;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class DataCreate {

    private final InitialUsers init_usr;
    private final InitialPizza initialPizza;
    private final InitialSauce initialSauce;

    public DataCreate(InitialUsers init_usr, InitialPizza initialPizza, InitialSauce initialSauce) {
        this.init_usr = init_usr;
        this.initialPizza = initialPizza;
        this.initialSauce = initialSauce;
    }

    @Bean
    public CommandLineRunner demo() {
        return (args) -> {
            init_usr.create();
            initialPizza.create();
            initialSauce.create();
            log.info("All is okay");
        };
    }
}
