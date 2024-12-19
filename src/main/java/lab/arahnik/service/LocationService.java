package lab.arahnik.service;

import lab.arahnik.entity.Location;
import lab.arahnik.repository.LocationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LocationService implements CrudService<Location> {
    private final LocationRepository repository;

    @Override
    public Location findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Location> findAll() {
        return repository.findAll();
    }

    @Override
    public Location save(Location entity) {
        return repository.save(entity);
    }

    @Override
    public Location update(Location entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
