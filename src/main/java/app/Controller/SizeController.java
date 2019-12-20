package app.Controller;

import app.entity.Size;
import app.service.SizeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/size")
public class SizeController {

    private final SizeService service;

    public SizeController(SizeService service) {
        this.service = service;
    }

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
