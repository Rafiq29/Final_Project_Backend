package app.Controller;

import app.entity.Meats;
import app.service.MeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class MeatController {
    @Autowired
    MeatService service;

    @GetMapping(path = ("/get"))
    public Meats getById (Meats meats) {
        return service.getMeat(meats.getMeatID());
    }

    @GetMapping(path = ("/all"))
    public List<Meats> getAll() {
        return service.getAllMeats();
    }

    @PostMapping(path = ("/add"))
    public String addPizza (Meats meats){
        service.addMeat(meats);
        return "Added";
    }
}
