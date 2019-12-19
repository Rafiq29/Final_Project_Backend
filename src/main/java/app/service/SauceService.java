package app.service;
import app.entity.Sauce;
import app.repo.SauceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SauceService {
    @Autowired
    private SauceRepo sauceRepo;

    public SauceService() {
    }

    public void addSauce(Sauce sauce) {
        sauceRepo.save(sauce);
    }

    public void deleteSauceByID(int id) {
        sauceRepo.deleteById((long) id);
    }

    public void deleteSauce(Sauce sauce) {
        sauceRepo.delete(sauce);
    }

    public Sauce getSauce(int id) {
        Optional<Sauce> optSous = sauceRepo.findById((long) id);
        return optSous.orElseGet(Sauce::new);
    }

    public List<Sauce> getAllSauce() {
        List<Sauce> sauces = new ArrayList<>();
        sauceRepo.findAll().forEach(sauces::add);
        return sauces;
    }
}
