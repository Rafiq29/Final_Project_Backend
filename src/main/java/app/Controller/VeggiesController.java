package app.Controller;

import app.entity.Veggies;
import app.service.VeggiesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/veggies")
public class VeggiesController {

    private final VeggiesService service;

    public VeggiesController(VeggiesService service) {
        this.service = service;
    }

    @GetMapping(path = ("/get"))
    public Veggies getById (Veggies veggies) {
        return service.getVeggies(veggies.getVeggiesID());
    }

    @GetMapping(path = ("/all"))
    public List<Veggies> getAll() {
        return service.getAllVeggies();
    }

    @PostMapping(path = ("/add"))
    public String addVeggie (Veggies veggies){
        service.addVeggies(veggies);
        return "Added";
    }
}
