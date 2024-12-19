package lab.arahnik.service;

import lab.arahnik.entity.Coordinates;
import lab.arahnik.repository.CoordinatesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CoordinatesService implements CrudService<Coordinates> {
    private final CoordinatesRepository repository;

    @Override
    public Coordinates findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Coordinates> findAll() {
        return repository.findAll();
    }

    @Override
    public Coordinates save(Coordinates entity) {
        return repository.save(entity);
    }

    @Override
    public Coordinates update(Coordinates entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
