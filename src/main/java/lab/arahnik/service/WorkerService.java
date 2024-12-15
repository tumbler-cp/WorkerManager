package lab.arahnik.service;

import lab.arahnik.dto.WorkerDto;
import lab.arahnik.entity.Worker;
import lab.arahnik.repository.WorkerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorkerService {
    private final WorkerRepository workerRepository;

    public List<Worker> findAll() {
        return workerRepository.findAll();
    }

    public Worker findById(Long id) {
        return workerRepository.findById(id).orElse(null);
    }

    public Worker save(WorkerDto workerDto) {
        return workerRepository.save(
                Worker.builder()
                        .name(workerDto.getName())
                        .rating(workerDto.getRating())
                        .salary(workerDto.getSalary())
                        .build()
        );
    }

    public Worker update(Worker worker) {
        return workerRepository.save(worker);
    }

    public void delete(Long id) {
        workerRepository.deleteById(id);
    }
}
