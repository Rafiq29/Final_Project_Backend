package app.Controller;

import app.entity.Meats;
import app.service.MeatService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/meats")
public class MeatController {
    private final MeatService service;

    public MeatController(MeatService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Meats getById (@PathVariable("id") int id) {
        return service.getMeat(id);
    }

    @GetMapping
    public Iterable<Meats> getAll() {
        return service.getAllMeats();
    }

    @PostMapping("/add")
    public String addMeat (@RequestBody Meats meats){
        service.addMeat(meats);
        return "Added";
    }

    @DeleteMapping("")
    public String delete(@RequestBody Meats meats) {
        service.deleteMeat(meats);
        return "Deleted";
    }
}
