package app.service;

import app.entity.InCard;
import app.repo.InCardRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class InCardService {

    private final InCardRepo inCardRepo;

    public InCardService(InCardRepo inCardRepo) {
        this.inCardRepo = inCardRepo;
    }

    public void addInCard(InCard inCard) {
        inCardRepo.save(inCard);
    }

    public void deleteInCardByID(int id) { inCardRepo.deleteById(id);}

    public void deleteInCard(InCard inCard) { inCardRepo.delete(inCard); }

    public void deleteByID(int id) {inCardRepo.deleteById(id);}

    public InCard getInCard(int id) {
        Optional<InCard> optInCard = inCardRepo.findById(id);
        return optInCard.orElseGet(InCard::new);
    }

    public List<InCard> getAllInCards() {
        List<InCard> inCards = new ArrayList<>();
        inCardRepo.findAll().forEach(inCards::add);
        return inCards;
    }
}
