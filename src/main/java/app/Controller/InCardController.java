package app.Controller;

import app.entity.InCard;
import app.entity.Veggies;
import app.service.InCardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/incard")
public class InCardController {

    private final InCardService service;

    public InCardController(InCardService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public InCard getById (@PathVariable("id") InCard card) {
        return service.getInCard(card.getInCardID());
    }

    @GetMapping
    public Iterable<InCard> getAll() {
        return service.getAllInCards();
    }

    @PostMapping
    public String addInCard (@RequestBody InCard card){
        service.addInCard(card);
        return "Added";
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@RequestBody int id) {
        service.deleteByID(id);
        return "Deleted";
    }
}
