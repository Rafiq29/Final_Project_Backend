package app.service;

import app.entity.Meats;
import app.repo.MeatRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class MeatService {

    private final MeatRepo meatRepo;

    public MeatService(MeatRepo meatRepo) {
        this.meatRepo = meatRepo;
    }

    public void addMeat(Collection<Meats> meats) {
        meatRepo.saveAll(
                meats.stream().map(m -> { m.setId(0); return m; }).collect(Collectors.toList())
        );
    }

    public void deleteMeat(Meats meats) {
        meatRepo.delete(meats);
    }

    public void deleteByID(int id) {meatRepo.deleteById(id);}
    public Meats getMeat(int id) {
        Optional<Meats> optVMeats = meatRepo.findById( id);
        return optVMeats.orElseGet(Meats::new);
    }

    public List<Meats> getAllMeats() {
        List<Meats> meats = new ArrayList<>();
        meatRepo.findAll().forEach(meats::add);
        return meats;
    }
}
