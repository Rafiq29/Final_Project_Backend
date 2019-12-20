package app.Controller;


import app.entity.Sauces;
import app.service.SauceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sauce")
public class SauceController {

    private final SauceService service;

    public SauceController(SauceService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Sauces getById (@PathVariable("id") Sauces sauces) {
        return service.getSauce(sauces.getSauceID());
    }

    @GetMapping
    public List<Sauces> getAll() {
        return service.getAllSauce();
    }

    @PostMapping
    public String addSauce (Sauces sauces){
        service.addSauce(sauces);
        return "Added";
    }
}
