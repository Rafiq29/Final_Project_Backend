package app.Controller;

import app.entity.InCard;
import app.service.InCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/incard")
public class InCardController {
    @Autowired
    InCardService service;

    @GetMapping(path = ("/get"))
    public InCard getById (InCard card) {
        return service.getInCard(card.getInCardID());
    }

    @GetMapping(path = ("/all"))
    public List<InCard> getAll() {
        return service.getAllInCards();
    }

    @PostMapping(path = ("/add"))
    public String addPizza (InCard card){
        service.addInCard(card);
        return "Added";
    }}
