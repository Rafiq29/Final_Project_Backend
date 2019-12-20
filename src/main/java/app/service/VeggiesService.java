package app.service;

import app.entity.Veggies;
import app.repo.VeggiesRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VeggiesService {

    private final VeggiesRepo veggiesRepo;

    public VeggiesService(VeggiesRepo veggiesRepo) {
        this.veggiesRepo = veggiesRepo;
    }

    public void addVeggies(Veggies veggies) {
        veggiesRepo.save(veggies);
    }

    public void deleteVeggiesByID(int id) {
        veggiesRepo.deleteById(id);
    }

    public void deleteVeggies(Veggies veggies) {
        veggiesRepo.delete(veggies);
    }

    public Veggies getVeggies(int id) {
        Optional<Veggies> optVeggies = veggiesRepo.findById( id);
        return optVeggies.orElseGet(Veggies::new);
    }

    public List<Veggies> getAllVeggies() {
        List<Veggies> veggies = new ArrayList<>();
        veggiesRepo.findAll().forEach(veggies::add);
        return veggies;
    }
}
