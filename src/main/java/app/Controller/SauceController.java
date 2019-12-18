package app.Controller;


import app.entity.Sauce;
import app.repo.SauceRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/sauce")
public class SauceController {

    @Autowired
    SauceRepo sauceRepo;

    @GetMapping(path = ("/get"))
    public Optional<Sauce> getByName (Sauce sauce){
        return sauceRepo.findById((long) sauce.getId());
    }

    @GetMapping(path = ("/all"))
    public Iterable<Sauce> getAll (){
        return sauceRepo.findAll();
    }
}
