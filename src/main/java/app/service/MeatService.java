package app.service;

import app.entity.Meats;
import app.repo.MeatRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MeatService {

    private final MeatRepo meatRepo;

    public MeatService(MeatRepo meatRepo) {
        this.meatRepo = meatRepo;
    }

    public void addMeat(Meats meats) {
        meatRepo.save(meats);
    }

    public void deleteMeatsByID(int id) {
        meatRepo.deleteById(id);
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
