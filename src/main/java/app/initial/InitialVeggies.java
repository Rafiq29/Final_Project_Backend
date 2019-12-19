package app.initial;

import app.entity.Veggies;
import app.repo.VeggiesRepo;
import org.springframework.stereotype.Component;

@Component
public class InitialVeggies {
    private final VeggiesRepo veggiesRepo;

    public InitialVeggies(VeggiesRepo veggiesRepo) {
        this.veggiesRepo = veggiesRepo;
    }

//    public void addVeggies () {
//        veggiesRepo.save(new Veggies("pineapples",))
//    }
}
