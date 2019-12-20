package app.Controller;


import app.entity.Sauces;
import app.service.SauceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/sauce")
public class SauceController {

    private final SauceService service;

    public SauceController(SauceService service) {
        this.service = service;
    }

    @GetMapping(path = ("/get"))
    public Sauces getById (Sauces sauces) {
        return service.getSauce(sauces.getSauceID());
    }

    @GetMapping(path = ("/all"))
    public List<Sauces> getAll() {
        return service.getAllSauce();
    }

    @PostMapping(path = ("/add"))
    public String addSauce (Sauces sauces){
        service.addSauce(sauces);
        return "Added";
    }
}
