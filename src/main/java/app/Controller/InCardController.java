package app.Controller;

import app.entity.InCard;
import app.repo.InCardRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/incard")
public class InCardController {
    @Autowired
    InCardRepo cardRepo;

    @GetMapping(path = ("/get"))
    public Optional<InCard> getById (InCard card) {
        return cardRepo.findById((long) card.getId());
    }

    @GetMapping(path = ("/all"))
    public Iterable<InCard> getAll() {
        return cardRepo.findAll();
    }

    @PostMapping(path = ("/add"))
    public String addPizza (InCard card){
        return "Added";
    }
}
