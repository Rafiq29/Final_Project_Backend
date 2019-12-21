package app.Controller;

import app.entity.Meats;
import app.service.MeatService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

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

    @PostMapping
    public String addMeat (@RequestBody Collection<Meats> meats){
        service.addMeat(meats);
        return "Added";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@RequestBody int id) {
        service.deleteByID(id);
        return "Deleted";
    }
}
