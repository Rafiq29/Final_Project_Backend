package app.service;
import app.entity.Sous;
import app.repo.SousRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SousService {
    @Autowired
    private SousRepo sousRepo;

    private void addSous(Sous sous) {
        sousRepo.save(sous);
    }

    private void deleteSousByID(int id) {
        sousRepo.deleteById((long) id);
    }

    private void deleteSous(Sous sous) {
        sousRepo.delete(sous);
    }

    private Sous getSous(int id) {
        Optional<Sous> optSous = sousRepo.findById((long) id);
        return optSous.orElseGet(Sous::new);
    }

    private List<Sous> getAllSous() {
        List<Sous> sous = new ArrayList<>();
        sousRepo.findAll().forEach(sous::add);
        return sous;
    }
}
