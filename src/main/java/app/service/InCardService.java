package app.service;

import app.entity.InCard;
import app.repo.InCardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class InCardService {
    @Autowired
    private InCardRepo inCardRepo;

    private void addInCard(InCard inCard) {
        inCardRepo.save(inCard);
    }

    private void deleteInCardByID(int id) {
        inCardRepo.deleteById((long) id);
    }

    private void deleteInCard(InCard inCard) { inCardRepo.delete(inCard); }

    private InCard getInCard(int id) {
        Optional<InCard> optInCard = inCardRepo.findById((long) id);
        return optInCard.orElseGet(InCard::new);
    }

    private List<InCard> getAllInCards() {
        List<InCard> inCards = new ArrayList<>();
        inCardRepo.findAll().forEach(inCards::add);
        return inCards;
    }
}
