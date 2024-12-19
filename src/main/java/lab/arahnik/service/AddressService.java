package lab.arahnik.service;

import lab.arahnik.entity.Address;
import lab.arahnik.repository.AddressRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AddressService implements CrudService<Address> {
    private final AddressRepository repository;

    @Override
    public Address findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Address> findAll() {
        return repository.findAll();
    }

    @Override
    public Address save(Address entity) {
        return repository.save(entity);
    }

    @Override
    public Address update(Address entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
