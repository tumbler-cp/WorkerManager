package lab.arahnik.service;

import lab.arahnik.dto.WorkerDto;
import lab.arahnik.entity.Worker;
import lab.arahnik.repository.WorkerRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CrudService<T> {
    T findById(Long id);
    List<T> findAll();
    T save(T entity);
    T update(T entity);
    void delete(Long id);
}
