package app.Controller;

import app.entity.Veggies;
import app.service.VeggiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class VeggiesController {
    @Autowired
    VeggiesService service;

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
