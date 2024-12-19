package lab.arahnik.service;

import lab.arahnik.entity.Organization;
import lab.arahnik.repository.OrganisationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrganisationService implements CrudService<Organization> {
    private final OrganisationRepository repository;

    @Override
    public Organization findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Organization> findAll() {
        return repository.findAll();
    }

    @Override
    public Organization save(Organization entity) {
        return repository.save(entity);
    }

    @Override
    public Organization update(Organization entity) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
