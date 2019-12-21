package app.service;

import app.entity.Veggies;
import app.repo.VeggiesRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VeggiesService {

    private final VeggiesRepo veggiesRepo;

    public VeggiesService(VeggiesRepo veggiesRepo) {
        this.veggiesRepo = veggiesRepo;
    }

    public void addVeggies(Collection<Veggies> veggies) {
        veggiesRepo.saveAll(veggies.stream().map(v -> { v.setId(0); return v; }).collect(Collectors.toList()));
    }

    public void deleteVeggies(Veggies veggies) {
        veggiesRepo.delete(veggies);
    }

    public void deleteByID(int id) {veggiesRepo.deleteById(id);}
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
