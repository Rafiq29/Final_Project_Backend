package app.service;
import app.entity.Sauces;
import app.repo.SauceRepo;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SauceService {

    private final SauceRepo sauceRepo;

    public SauceService(SauceRepo sauceRepo) {
        this.sauceRepo = sauceRepo;
    }

    public void addSauce(Collection<Sauces> sauces) {
        sauceRepo.saveAll(sauces.stream().map(s -> { s.setId(0); return s; }).collect(Collectors.toList()));
    }


    public void deleteSauce(Sauces sauces) {
        sauceRepo.delete(sauces);
    }
    public void deleteByID(int id) {sauceRepo.deleteById(id);}

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
