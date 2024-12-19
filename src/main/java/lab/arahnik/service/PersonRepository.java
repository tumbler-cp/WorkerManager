package lab.arahnik.service;

import lab.arahnik.entity.Person;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonRepository implements CrudService<Person> {
    private final PersonRepository repository;

    @Override
    public Person findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Person> findAll() {
        return repository.findAll();
    }

    @Override
    public Person save(Person entity) {
        return repository.save(entity);
    }

    @Override
    public Person update(Person entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        repository.delete(id);
    }
}
