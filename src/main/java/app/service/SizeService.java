package app.service;

import app.entity.Size;
import app.repo.SizeRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SizeService  {

    private final SizeRepo sizeRepo;

    public SizeService(SizeRepo sizeRepo) {
        this.sizeRepo = sizeRepo;
    }

    public void addSize(Collection<Size> size) {
        sizeRepo.saveAll(size.stream().map(s -> { s.setId(0); return s; }).collect(Collectors.toList()));
    }


    public void deleteSize(Size size) {
        sizeRepo.delete(size);
    }
    public void deleteByID(int id) {sizeRepo.deleteById(id);}

    public Size getSize(int id) {
        Optional<Size> optSize = sizeRepo.findById( id);
        return optSize.orElseGet(Size::new);
    }

    public List<Size> getAllSize() {
        List<Size> size = new ArrayList<>();
        sizeRepo.findAll().forEach(size::add);
        return size;
    }
}
