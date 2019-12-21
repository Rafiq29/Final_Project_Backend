package app.Controller;

import app.entity.Basket;
import app.service.InCardService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/incard")
public class InCardController {

    private final InCardService service;

    public InCardController(InCardService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Basket getById (@PathVariable("id") Basket card) {
        return service.getInCard(card.getId());
    }

    @GetMapping
    public Iterable<Basket> getAll() {
        return service.getAllInCards();
    }

    @PostMapping
    public String addInCard (@RequestBody Collection<Basket> card){
        service.addInCard(card);
        return "Added";
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@RequestBody int id) {
        service.deleteByID(id);
        return "Deleted";
    }
}
