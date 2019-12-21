package app.Controller;

import app.entity.Meats;
import app.entity.Veggies;
import app.service.VeggiesService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/veggies")
public class VeggiesController {

    private final VeggiesService service;
    public VeggiesController(VeggiesService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Veggies getById (@PathVariable("id") Veggies veggies) {
        return service.getVeggies(veggies.getId());
    }

    @GetMapping
    public Iterable<Veggies> getAll() {
        return service.getAllVeggies();
    }

    @PostMapping
    public String addVeggie (@RequestBody Collection<Veggies> veggies){
        service.addVeggies(veggies);
        return "Added";
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        service.deleteByID(id);
        return "Deleted";
    }
}
