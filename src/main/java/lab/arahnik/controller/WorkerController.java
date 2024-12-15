package lab.arahnik.controller;

import lab.arahnik.dto.WorkerDto;
import lab.arahnik.entity.Worker;
import lab.arahnik.service.WorkerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/workers")
@RequiredArgsConstructor
public class WorkerController {
    private final WorkerService workerService;

    @GetMapping
    public List<Worker> listAll() {
        return workerService.findAll();
    }

    @PostMapping("/new")
    public ResponseEntity<?> create(@RequestBody WorkerDto worker) {
        Worker obj;
        try {
            obj = workerService.save(worker);
        } catch (Exception e) {
            return ResponseEntity.badRequest()
                    .body(e.getMessage());
        }
        return ResponseEntity.ok(obj);
    }

}
