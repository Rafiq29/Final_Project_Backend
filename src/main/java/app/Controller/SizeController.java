package app.Controller;

import app.entity.Size;
import app.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public class SizeController {
    @Autowired
    SizeService service;

    @GetMapping(path = ("/get"))
    public Size getById (Size size) {
        return service.getSize(size.getSizeID());
    }

    @GetMapping(path = ("/all"))
    public List<Size> getAll() {
        return service.getAllSize();
    }

    @PostMapping(path = ("/add"))
    public String addSize (Size size){
        service.addSize(size);
        return "Added";
    }
}
