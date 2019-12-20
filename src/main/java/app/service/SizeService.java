package app.service;

import app.entity.Size;
import app.repo.SizeRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SizeService  {

    private final SizeRepo sizeRepo;

    public SizeService(SizeRepo sizeRepo) {
        this.sizeRepo = sizeRepo;
    }

    public void addSize(Size size) {
        sizeRepo.save(size);
    }

    public void deleteSizeByID(int id) {
        sizeRepo.deleteById(id);
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
