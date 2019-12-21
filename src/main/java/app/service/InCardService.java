package app.service;

import app.entity.Basket;
import app.repo.InCardRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class InCardService {

    private final InCardRepo inCardRepo;

    public InCardService(InCardRepo inCardRepo) {
        this.inCardRepo = inCardRepo;
    }

    public void addInCard(Collection<Basket> basket) {
        inCardRepo.saveAll(basket);
    }

    public void deleteInCard(Basket basket) { inCardRepo.delete(basket); }

    public void deleteByID(int id) {inCardRepo.deleteById(id);}

    public Basket getInCard(int id) {
        Optional<Basket> optInCard = inCardRepo.findById(id);
        return optInCard.orElseGet(Basket::new);
    }

    public List<Basket> getAllInCards() {
        List<Basket> baskets = new ArrayList<>();
        inCardRepo.findAll().forEach(baskets::add);
        return baskets;
    }
}
