package app.service;
import app.entity.Sauces;
import app.repo.SauceRepo;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SauceService {

    private final SauceRepo sauceRepo;

    public SauceService(SauceRepo sauceRepo) {
        this.sauceRepo = sauceRepo;
    }

    public void addSauce(Sauces sauces) {
        sauceRepo.save(sauces);
    }

    public void deleteSauceByID(int id) {
        sauceRepo.deleteById( id);
    }

    public void deleteSauce(Sauces sauces) {
        sauceRepo.delete(sauces);
    }

    public Sauces getSauce(int id) {
        Optional<Sauces> optSous = sauceRepo.findById( id);
        return optSous.orElseGet(Sauces::new);
    }

    public List<Sauces> getAllSauce() {
        List<Sauces> sauces = new ArrayList<>();
        sauceRepo.findAll().forEach(sauces::add);
        return sauces;
    }
}
