package app.Controller;

import app.entity.Size;
import app.service.SizeService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/size")
public class SizeController {

    private final SizeService service;

    public SizeController(SizeService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Size getById (@PathVariable("id") Size size) {
        return service.getSize(size.getId());
    }

    @GetMapping
    public Iterable<Size> getAll() {
        return service.getAllSize();
    }

    @PostMapping
    public String addSize ( @RequestBody Collection<Size> size){
        service.addSize(size);
        return "Added";
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@RequestBody int id) {
        service.deleteByID(id);
        return "Deleted";
    }
}
