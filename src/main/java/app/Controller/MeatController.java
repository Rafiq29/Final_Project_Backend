package app.Controller;

import app.entity.Meats;
import app.service.MeatService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/meats")
public class MeatController {

    private final MeatService service;

    public MeatController(MeatService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Meats getById (@PathVariable("id") Meats meats) {
        return service.getMeat(meats.getMeatID());
    }

    @GetMapping
    public List<Meats> getAll() {
        return service.getAllMeats();
    }

    @PostMapping
    public String addMeat (Meats meats){
        service.addMeat(meats);
        return "Added";
    }
}
